package com.ten_thousand.silver_paving.controller.hzcontroller;

import com.ten_thousand.silver_paving.dto.hz.Register;
import com.ten_thousand.silver_paving.realm.FxUsernamePasswordToken;
import com.ten_thousand.silver_paving.service.hz.IRegisterService;
import org.apache.commons.lang.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sysconfig.SysConfig;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

@Controller
@RequestMapping("/register")
public class RegController {
    @Autowired
    private IRegisterService registerService;
    @Autowired
    private StringRedisTemplate redisTemplate;
    @RequestMapping("/login")

    public String login(String tel,String password,Boolean rememberMe) {

        //使用shiro进行登录
        FxUsernamePasswordToken passwordToken = new FxUsernamePasswordToken(tel, password);
        passwordToken.setSwitchType(SysConfig.REALM_REJESTER_NAME);
        System.out.println(tel + password);
        passwordToken.setRememberMe(true);
        try {
            SecurityUtils.getSubject().login(passwordToken);

        } catch (AuthenticationException e) {
            e.printStackTrace();
            return "frontlogin";
        }
//        //判断usertoken是否存在
        String tokenUsername = (String) redisTemplate.opsForHash().get("userToken", "name");
        if (StringUtils.equals(tel, tokenUsername)) {
            //ajax返回用户不能重复登录
            return "frontlogin";
        }
        //将tel作为usertoken 存入redis
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("tel",tel);
        redisTemplate.boundHashOps("userToken").putAll(hashmap);
        //设置过期时间，单位为20分钟，与remeberme设置cookie过期时间保持一致
        redisTemplate.expire("userToken",20, TimeUnit.MINUTES);
        return "redirect:/production/indexList";
    }

    @RequestMapping("/exit")
    public String exit(){

        return "login";
    }
    @RequestMapping("/show")
    public String save(@RequestParam("register") Register register){
        registerService.insertRegister(register);
        return "index";
    }

    @RequestMapping("/delete")
    public String delete(@RequestParam("regId") Integer regId){
        registerService.deleteRegister(regId);
        return "index";
    }

    @RequestMapping("/update")
    public String update(@RequestParam("regId") Integer regId){
        registerService.updateRegisterById(regId);
        return "index";
    }
}
