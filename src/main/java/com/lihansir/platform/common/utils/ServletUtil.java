/*
 * Copyright Li Han Holding.
 */

package com.lihansir.platform.common.utils;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.util.StrUtil;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet util
 *
 * @author <a href="https://www.lihansir.com">Li Han</a>
 */
public class ServletUtil {

    /**
     * Get String parameter
     * 
     * @param name
     *            parameter name
     * @return parameter value
     */
    public static String getParameter(String name) {
        return getRequest().getParameter(name);
    }

    /**
     * Get String parameter
     * 
     * @param name
     *            parameter name
     * @param defaultValue
     *            default value
     * @return parameter value
     */
    public static String getParameter(String name, String defaultValue) {
        return Convert.toStr(getRequest().getParameter(name), defaultValue);
    }

    /**
     * Get Integer parameter
     *
     * @param name
     *            parameter name
     * @return parameter value
     */
    public static Integer getParameterToInt(String name) {
        return Convert.toInt(getRequest().getParameter(name));
    }

    /**
     * Get Integer parameter
     *
     * @param name
     *            parameter name
     * @param defaultValue
     *            default value
     * @return parameter value
     */
    public static Integer getParameterToInt(String name, Integer defaultValue) {
        return Convert.toInt(getRequest().getParameter(name), defaultValue);
    }

    /**
     * Get request
     * 
     * @return http request
     */
    public static HttpServletRequest getRequest() {
        return getRequestAttributes().getRequest();
    }

    /**
     * Get response
     * 
     * @return http response
     */
    public static HttpServletResponse getResponse() {
        return getRequestAttributes().getResponse();
    }

    /**
     * Get session
     * 
     * @return http session
     */
    public static HttpSession getSession() {
        return getRequest().getSession();
    }

    /**
     * Get request attributes
     * 
     * @return Servlet request attributes
     */
    public static ServletRequestAttributes getRequestAttributes() {
        RequestAttributes attributes = RequestContextHolder.getRequestAttributes();
        return (ServletRequestAttributes)attributes;
    }

    /**
     * Judge whether it is ajax request
     * 
     * @param request
     *            http request
     * @return true if is ajax request
     */
    public static boolean isAjaxRequest(HttpServletRequest request) {
        String accept = request.getHeader("accept");
        if (accept != null && accept.contains("application/json")) {
            return true;
        }

        String xRequestedWith = request.getHeader("X-Requested-With");
        if (xRequestedWith != null && xRequestedWith.contains("XMLHttpRequest")) {
            return true;
        }

        String uri = request.getRequestURI();
        if (StrUtil.containsAnyIgnoreCase(uri, ".json", ".xml")) {
            return true;
        }

        String ajax = request.getParameter("__ajax");
        return StrUtil.containsAnyIgnoreCase(ajax, "json", "xml");
    }

}
