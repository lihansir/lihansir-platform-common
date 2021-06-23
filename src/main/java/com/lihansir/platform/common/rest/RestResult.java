/*
 * Copyright Li Han Holding.
 */

package com.lihansir.platform.common.rest;

import com.lihansir.platform.common.code.CommonCode;
import com.lihansir.platform.common.code.RestCode;
import java.io.Serializable;

/**
 * Unified Response Object
 *
 * @author <a href="https://www.lihansir.com">Li Han</a>
 */
public class RestResult<T> implements Serializable {

    private static final long serialVersionUID = 892309986077110782L;

    private boolean success = true;
    private T data;
    private String errorCode = "";
    private String errorMessage = "";
    /**
     * error display type： 0 silent; 1 message.warn; 2 message.error; 4 notification; 9 page
     */
    private int showType = 2;
    private String traceId = "";
    private String host = "";

    public RestResult() {}

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
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

    public int getShowType() {
        return showType;
    }

    public void setShowType(int showType) {
        this.showType = showType;
    }

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Override
    public String toString() {
        return "RestResult{" + "success=" + success + ", data=" + data + ", errorCode='" + errorCode + '\''
            + ", errorMessage='" + errorMessage + '\'' + ", showType=" + showType + ", traceId='" + traceId + '\''
            + ", host='" + host + '\'' + '}';
    }

    public static <T> RestResult<T> success() {
        return RestResult.<T>builder().success(true).build();
    }

    public static <T> RestResult<T> success(T data) {
        return RestResult.<T>builder().success(true).data(data).build();
    }

    public static <T> RestResult<T> failed() {
        return RestResult.<T>builder().success(false).errorCode(CommonCode.FAILED.getErrorCode())
            .errorMessage(CommonCode.FAILED.getErrorMessage()).build();
    }

    public static <T> RestResult<T> failed(String errorMessage) {
        return RestResult.<T>builder().success(false).errorCode(CommonCode.FAILED.getErrorCode())
            .errorMessage(errorMessage).build();
    }

    public static <T> RestResult<T> failed(String errorCode, T data) {
        return RestResult.<T>builder().success(false).errorCode(errorCode).data(data)
            .errorMessage(CommonCode.FAILED.getErrorMessage()).build();
    }

    public static <T> RestResult<T> failed(RestCode restCode, T data) {
        return RestResult.<T>builder().success(false).errorCode(restCode.getErrorCode()).data(data)
            .errorMessage(restCode.getErrorMessage()).build();
    }

    public static <T> RestResult<T> failed(RestCode restCode) {
        return RestResult.<T>builder().success(false).errorCode(restCode.getErrorCode())
            .errorMessage(restCode.getErrorMessage()).build();
    }

    public static <T> RestResult<T> failed(String errorCode, String errorMessage, T data) {
        return RestResult.<T>builder().success(false).errorCode(errorCode).data(data).errorMessage(errorMessage)
            .build();
    }

    public static <T> RestResult<T> failedWithErrorMessage(String errorCode, String errorMessage) {
        return RestResult.<T>builder().success(false).errorCode(errorCode).errorMessage(errorMessage).build();
    }

    public static <T> RestResultBuilder<T> builder() {
        return new RestResultBuilder<>();
    }

    public static final class RestResultBuilder<T> {
        private boolean success;
        private T data;
        private String errorCode;
        private String errorMessage;
        /**
         * error display type： 0 silent; 1 message.warn; 2 message.error; 4 notification; 9 page
         */
        private int showType;
        private String traceId;
        private String host;

        private RestResultBuilder() {}

        public RestResultBuilder<T> success(boolean success) {
            this.success = success;
            return this;
        }

        public RestResultBuilder<T> data(T data) {
            this.data = data;
            return this;
        }

        public RestResultBuilder<T> errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        public RestResultBuilder<T> errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        public RestResultBuilder<T> showType(int showType) {
            this.showType = showType;
            return this;
        }

        public RestResultBuilder<T> traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public RestResultBuilder<T> host(String host) {
            this.host = host;
            return this;
        }

        public RestResult<T> build() {
            RestResult<T> restResult = new RestResult<>();
            restResult.setSuccess(success);
            restResult.setData(data);
            restResult.setErrorCode(errorCode);
            restResult.setErrorMessage(errorMessage);
            restResult.setShowType(showType);
            restResult.setTraceId(traceId);
            restResult.setHost(host);
            return restResult;
        }
    }

}
