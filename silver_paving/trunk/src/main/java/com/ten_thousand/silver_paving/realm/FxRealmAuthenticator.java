package com.ten_thousand.silver_paving.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.pam.ModularRealmAuthenticator;
import org.apache.shiro.realm.Realm;
import java.util.ArrayList;
import java.util.Collection;

public class FxRealmAuthenticator extends ModularRealmAuthenticator{

    protected AuthenticationInfo doAuthenticate(AuthenticationToken authenticationToken) throws AuthenticationException {
        assertRealmsConfigured();
        Collection<Realm> realms = getRealms();

        //将authenticationToken转换成FxUsernamePasswordToken
        FxUsernamePasswordToken token = (FxUsernamePasswordToken) authenticationToken;
        String switchType = token.getSwitchType();

        ArrayList<Realm> myRealms = new ArrayList<Realm>();

        for (Realm realm:realms) {
            String name = realm.getName();
            if (name.equals(switchType)){
                //匹配成功，就是我们需要使用realm
                myRealms.add(realm);
            }
        }

        if (myRealms.isEmpty()) {
            throw new AuthenticationException("没有找到匹配的Realm");
        }

        if (myRealms.size() == 1) {
            return doSingleRealmAuthentication(myRealms.iterator().next(), authenticationToken);
        } else {
            return doMultiRealmAuthentication(myRealms, authenticationToken);
        }
    }
}
