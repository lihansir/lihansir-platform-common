/*
 * Copyright Li Han Holding.
 */

package com.lihansir.platform.common.code;

/**
 * Common Response Code
 *
 * @author <a href="https://www.lihansir.com">Li Han</a>
 */
public enum CommonCode implements RestCode {

    FAILED("500", "failed"),

    ERROR_TOKEN("40001", "Token verification failed"),

    PARAM_CHECK_ERROR("40002", "Parameter verification failed"),

    REQUEST_METHOD_ERROR("40003", "Unsupported request method"),

    ERROR_URL("40004", "Request path error"),

    BUSINESS_EXECUTE_ERROR("40005", "Business logic processing exception"),

    ILLEGAL_ARGUMENT_ERROR("40006", "Illegal argument error"),

    SERVER_ERROR("50000", "Server error"),

    REDIRECT_ERROR("50001", "Error in request redirection");

    private final String errorCode;

    private final String errorMessage;

    CommonCode(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    @Override
    public String getErrorCode() {
        return this.errorCode;
    }

    @Override
    public String getErrorMessage() {
        return this.errorMessage;
    }
}
