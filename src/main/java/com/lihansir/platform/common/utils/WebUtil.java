/*
 * Copyright Li Han Holding.
 */

package com.lihansir.platform.common.utils;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

/**
 * Web Tools
 *
 * @author <a href="https://www.lihansir.com">Li Han</a>
 */
public class WebUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(WebUtil.class);

    /**
     * Return json result
     *
     * @param response
     *            http response
     * @param result
     *            result data object
     */
    public static void returnJsonResponse(HttpServletResponse response, Object result) {
        try (OutputStream out = response.getOutputStream()) {
            response.setCharacterEncoding(StandardCharsets.UTF_8.name());
            response.setContentType("text/json");
            out.write(JSONObject.toJSONBytes(result));
            out.flush();
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
    }

    /**
     * Get post string data from request
     *
     * @param request
     *            http request
     * @return post string data
     */
    public static String getRequestJsonString(HttpServletRequest request) {
        try {
            String submitMethod = request.getMethod();
            if ("GET".equals(submitMethod)) {
                return new String(request.getQueryString().getBytes(StandardCharsets.ISO_8859_1),
                    StandardCharsets.UTF_8).replaceAll("%22", "\"");
            } else {
                return getRequestPostStr(request);
            }
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
        return "";
    }

    /**
     * Get post string data from request
     *
     * @param request
     *            http request
     * @return post string data
     */
    private static String getRequestPostStr(HttpServletRequest request) {
        byte[] buffer = getRequestPostBytes(request);
        String charEncoding = request.getCharacterEncoding();
        if (charEncoding == null) {
            charEncoding = StandardCharsets.UTF_8.name();
        }
        String resultStr = "";
        try {
            resultStr = new String(buffer, charEncoding);
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
        return resultStr;
    }

    /**
     * Get post data from request
     *
     * @param request
     *            http request
     * @return data byte array
     */
    private static byte[] getRequestPostBytes(HttpServletRequest request) {
        int contentLength = request.getContentLength();
        byte[] buffer = new byte[0];
        if (contentLength < 0) {
            return buffer;
        }
        buffer = new byte[contentLength];
        try {
            for (int i = 0; i < contentLength;) {
                int readLen = request.getInputStream().read(buffer, i, contentLength - i);
                if (readLen == -1) {
                    break;
                }
                i += readLen;
            }
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
        return buffer;
    }

}
