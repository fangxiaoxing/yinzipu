package com.ten_thousand.silver_paving.realm;

import com.ten_thousand.silver_paving.dao.hzdao.IAdmi;
import com.ten_thousand.silver_paving.dto.hz.Administer;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import sysconfig.SysConfig;

import java.util.List;

public class AdmiRealm  extends AuthorizingRealm{

public String getName(){
    return SysConfig.REALM_ADMI_NAME;
}
@Autowired
private IAdmi admidao;

/*
权限和角色查询
 */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        String princal = principals.getPrimaryPrincipal().toString();
        List<String> role = admidao.queryRoleByName(princal);
        if(role==null || role.isEmpty()){
            throw new AuthenticationException("no role");
        }
        List<String> permission = admidao.queryPermissionByName(role.get(0));
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        authorizationInfo.addStringPermissions(permission);
        authorizationInfo.addRoles(role);
        return authorizationInfo;
    }
        /*
        登录认证
         */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        /*
        装一个token
         */
        UsernamePasswordToken token1 =(UsernamePasswordToken) token;
//        获得用户名
        String username = token1.getUsername();
//        获得密码
        char[] passwordchar = token1.getPassword();
//        获得密码
        String password = new String(passwordchar);
//        验证用户名
        Administer admi = admidao.checkadmi(username);
        if(admi == null){
            throw new UnknownAccountException("用户名为空");
        }
        //验证密码
        String admiPassword = admi.getAdmiPassword();
        //密码加盐
        SimpleHash simpleHash = new SimpleHash("MD5", password, admi.getSalt());

        if(!simpleHash.toString().equalsIgnoreCase(admiPassword)){
            throw new IncorrectCredentialsException("密码错误");
        }

        return new SimpleAuthenticationInfo(username,password,getName());
    }
}
