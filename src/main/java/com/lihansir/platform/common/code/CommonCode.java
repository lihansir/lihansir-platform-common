/*
 * Copyright Li Han Holding.
 */

package com.lihansir.platform.common.code;

/**
 * <p>
 * Common Response Code
 * </p>
 *
 * @author <a href="https://www.lihansir.com">Li Han</a>
 * @date Created in 2020/10/03 10:16
 **/
public enum CommonCode implements RestCode {

    OK(200, "success"),

    ERROR_TOKEN(4001, "Token verification failed"),

    PARAM_CHECK_ERROR(4002, "Parameter verification failed"),

    REQUEST_METHOD_ERROR(4003, "Unsupported request method"),

    ERROR_URL(4004, "Request path error"),

    BUSINESS_EXECUTE_ERROR(4005, "Business logic processing exception"),

    ILLEGAL_ARGUMENT_ERROR(4006, "Illegal argument error"),

    SERVER_ERROR(5000, "Server error"),

    REDIRECT_ERROR(5001, "Error in request redirection"),

    FAILED(50000, "failed");

    private final int code;

    private final String msg;

    CommonCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public int getCode() {
        return this.code;
    }

    @Override
    public String getMsg() {
        return this.msg;
    }
}
