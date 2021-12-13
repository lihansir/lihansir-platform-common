/*
 * Copyright Li Han Holding.
 */

package com.lihansir.platform.common.exception;

import com.lihansir.platform.common.code.CommonCode;
import com.lihansir.platform.common.code.RestCode;

/**
 * with data exception
 *
 * @author <a href="https://www.lihansir.com">Li Han</a>
 */
public class WithDataException extends RuntimeException {

    private static final long serialVersionUID = -7488035596379501487L;

    private String errorCode;

    private String errorMessage;

    private Object data;

    public WithDataException(Object data) {
        super("");
        this.errorCode = CommonCode.BUSINESS_EXECUTE_ERROR.getErrorCode();
        this.errorMessage = "";
        this.data = data;
    }

    public WithDataException(String errorMessage, Object data) {
        super(errorMessage);
        this.errorCode = CommonCode.BUSINESS_EXECUTE_ERROR.getErrorCode();
        this.errorMessage = errorMessage;
        this.data = data;
    }

    public WithDataException(String errorCode, String errorMessage, Object data) {
        super(errorMessage);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.data = data;
    }

    public WithDataException(RestCode code, Object data) {
        super(code.getErrorMessage());
        this.errorCode = code.getErrorCode();
        this.errorMessage = code.getErrorMessage();
        this.data = data;
    }

    public WithDataException(Throwable cause, RestCode code, Object data) {
        super(cause);
        this.errorCode = code.getErrorCode();
        this.errorMessage = code.getErrorMessage();
        this.data = data;
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "WithDataException{" +
                "errorCode='" + errorCode + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                ", data=" + data +
                '}';
    }

}
