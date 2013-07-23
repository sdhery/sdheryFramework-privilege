package com.sdhery.module.privilege.filter;

import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Created with IntelliJ IDEA.
 * User: sdhery
 * Date: 13-7-23
 * Time: 下午4:24
 * To change this template use File | Settings | File Templates.
 */
public class LoginFormAuthenticationFilter extends FormAuthenticationFilter {

    @Override
    protected AuthenticationToken createToken(ServletRequest request, ServletResponse response) {
       return null;
    }
}
