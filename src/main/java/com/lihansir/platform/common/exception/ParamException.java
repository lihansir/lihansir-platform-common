/*
 * Copyright Li Han Holding.
 */

package com.lihansir.platform.common.exception;

import com.lihansir.platform.common.code.CommonCode;
import com.lihansir.platform.common.code.RestCode;

/**
 * Parameter verification error exception
 *
 * @author <a href="https://www.lihansir.com">Li Han</a>
 */
public class ParamException extends RuntimeException {

    private static final long serialVersionUID = 3496354170767422449L;

    private String errorCode = CommonCode.PARAM_CHECK_ERROR.getErrorCode();

    private String errorMessage;

    public ParamException(String errorMessage) {
        super(errorMessage);
        this.errorMessage = errorMessage;
    }

    public ParamException(String paramName, String errorMessage) {
        super("Parameter：【" + paramName + "】" + errorMessage);
        this.errorMessage = "Parameter：【" + paramName + "】" + errorMessage;
    }

    public ParamException(RestCode restCode) {
        super(restCode.getErrorMessage());
        this.errorCode = restCode.getErrorCode();
        this.errorMessage = restCode.getErrorMessage();
    }

    public ParamException(Throwable cause, String errorMessage) {
        super(cause);
        this.errorMessage = errorMessage;
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
        return "ParamException{" + "errorCode='" + errorCode + '\'' + ", errorMessage='" + errorMessage + '\'' + '}';
    }
}
