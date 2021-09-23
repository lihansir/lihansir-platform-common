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

    FAILED("request_failed", "failed"),

    PARAM_CHECK_ERROR("param_check_error", "Parameter verification failed"),

    SERVLET_ERROR("bad_request", "Bad request"),

    ERROR_URL("request_path_not_found", "Request path error"),

    BUSINESS_EXECUTE_ERROR("business_execute_error", "Business logic processing exception"),

    ILLEGAL_ARGUMENT_ERROR("illegal_argument_error", "Illegal argument error"),

    PROGRAM_EXECUTION_EXCEPTION("program_execution_exception", "Program execution exception");

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
