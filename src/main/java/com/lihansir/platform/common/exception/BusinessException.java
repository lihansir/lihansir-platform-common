/*
 * Copyright Li Han Holding.
 */

package com.lihansir.platform.common.exception;

import com.lihansir.platform.common.code.CommonCode;
import com.lihansir.platform.common.code.RestCode;

/**
 * General service exception
 *
 * @author <a href="https://www.lihansir.com">Li Han</a>
 */
public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = -2714635136932653280L;

    private String errorCode;

    private String errorMessage;

    public BusinessException(String errorMessage) {
        super(errorMessage);
        this.errorCode = CommonCode.BUSINESS_EXECUTE_ERROR.getErrorCode();
        this.errorMessage = errorMessage;
    }

    public BusinessException(String errorCode, String errorMessage) {
        super(errorMessage);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public BusinessException(RestCode code) {
        super(code.getErrorMessage());
        this.errorCode = code.getErrorCode();
        this.errorMessage = code.getErrorMessage();
    }

    public BusinessException(Throwable cause, RestCode code) {
        super(cause);
        this.errorCode = code.getErrorCode();
        this.errorMessage = code.getErrorMessage();
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public String toString() {
        return "BusinessException{" + "errorCode='" + errorCode + '\'' + ", errorMessage='" + errorMessage + '\'' + '}';
    }
}
