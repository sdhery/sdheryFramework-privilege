package com.sdhery.module.privilege.realm;

import com.sdhery.module.privilege.token.AdminUserToken;
import org.apache.log4j.Logger;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * Created with IntelliJ IDEA.
 * User: sdhery
 * Date: 13-7-19
 * Time: 下午3:12
 * 后台安全认证实现类
 */
public class AdminAuthorizingRealm extends AuthorizingRealm {
    private Logger log = Logger.getLogger(getClass());

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        log.info("doGetAuthorizationInfo....");
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        AdminUserToken token = (AdminUserToken) authenticationToken;
        log.info(token.getUsername());
        log.info(token.getPassword());
        return null;
    }
}
