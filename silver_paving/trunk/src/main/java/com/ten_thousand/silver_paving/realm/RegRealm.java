package com.ten_thousand.silver_paving.realm;
import com.ten_thousand.silver_paving.dao.hzdao.IRegister;
import com.ten_thousand.silver_paving.dto.hz.Register;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import sysconfig.SysConfig;

public class RegRealm extends AuthorizingRealm {

    @Autowired
    private IRegister registerdao;

    @Override
    public String getName(){
        return SysConfig.REALM_REJESTER_NAME;
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        UsernamePasswordToken token1 = (UsernamePasswordToken) token;
//        获得用户电话号码
        String tel = token1.getUsername();
//        获得密码
        char[] passwordchar = token1.getPassword();
//        将密码编程string类型 方便加盐
        String password = new String(passwordchar);
//        验证用户名
        Register telphone = registerdao.findRegisterByTelphone(tel);
        if(telphone == null){
            throw new UnknownAccountException("用户名手机不能为空");
        }
//        验证
        String password1 = telphone.getPassword();
//        密码加盐
        SimpleHash simpleHash = new SimpleHash("MD5", password, telphone.getSalt());
        if(!simpleHash.toString().equalsIgnoreCase(password1)){
            throw new IncorrectCredentialsException("密码错误");
        }
        return new SimpleAuthenticationInfo(tel,password,getName());
    }
}
