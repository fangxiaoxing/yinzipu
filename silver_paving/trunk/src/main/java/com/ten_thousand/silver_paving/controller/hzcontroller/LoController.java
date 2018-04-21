package com.ten_thousand.silver_paving.controller.hzcontroller;
import com.ten_thousand.silver_paving.dao.hzdao.IAdmi;
import com.ten_thousand.silver_paving.realm.FxUsernamePasswordToken;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import sysconfig.SysConfig;
@Controller
@RequestMapping("/user")
public class LoController {
    @Autowired
    private IAdmi iAdmidao;
// @ResponseBody //返回值直接是一个字符串，不会走视图解析器
    @RequestMapping("/login")
    public String login(String username,String password) {
        try {
            FxUsernamePasswordToken passwordToken = new FxUsernamePasswordToken(username, password);
            passwordToken.setSwitchType(SysConfig.REALM_ADMI_NAME);
//            passwordToken.setRememberMe(rememberMe);
            SecurityUtils.getSubject()
                    .login(passwordToken);
        } catch (AuthenticationException e) {
            e.printStackTrace();
            return "login";
        }
        return "redirect:/car/carList";
        }

}
