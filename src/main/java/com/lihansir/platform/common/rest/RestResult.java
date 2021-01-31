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

    private int code;
    private String message;
    private T data;

    public RestResult() {}

    public RestResult(int code, String message, T data) {
        this.code = code;
        this.setMessage(message);
        this.data = data;
    }

    public RestResult(int code, T data) {
        this.code = code;
        this.data = data;
    }

    public RestResult(int code, String message) {
        this.code = code;
        this.setMessage(message);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean ok() {
        return this.code == CommonCode.OK.getCode();
    }

    @Override
    public String toString() {
        return "RestResult{" + "code=" + code + ", message='" + message + '\'' + ", data=" + data + '}';
    }

    public static <T> RestResult<T> success() {
        return RestResult.<T>builder().code(CommonCode.OK.getCode()).message(CommonCode.OK.getMsg()).build();
    }

    public static <T> RestResult<T> success(T data) {
        return RestResult.<T>builder().code(CommonCode.OK.getCode()).data(data).message(CommonCode.OK.getMsg()).build();
    }

    public static <T> RestResult<T> success(int code, T data) {
        return RestResult.<T>builder().code(code).data(data).message(CommonCode.OK.getMsg()).build();
    }

    public static <T> RestResult<T> failed() {
        return RestResult.<T>builder().code(CommonCode.FAILED.getCode()).message(CommonCode.FAILED.getMsg()).build();
    }

    public static <T> RestResult<T> failed(String errMsg) {
        return RestResult.<T>builder().code(CommonCode.FAILED.getCode()).message(errMsg).build();
    }

    public static <T> RestResult<T> failed(int code, T data) {
        return RestResult.<T>builder().code(code).data(data).message(CommonCode.FAILED.getMsg()).build();
    }

    public static <T> RestResult<T> failed(RestCode restCode, T data) {
        return RestResult.<T>builder().code(restCode.getCode()).data(data).message(restCode.getMsg()).build();
    }

    public static <T> RestResult<T> failed(RestCode restCode) {
        return RestResult.<T>builder().code(restCode.getCode()).message(restCode.getMsg()).build();
    }

    public static <T> RestResult<T> failed(int code, T data, String errMsg) {
        return RestResult.<T>builder().code(code).data(data).message(errMsg).build();
    }

    public static <T> RestResult<T> failedWithMsg(int code, String errMsg) {
        return RestResult.<T>builder().code(code).message(errMsg).build();
    }

    public static <T> RestResultBuilder<T> builder() {
        return new RestResultBuilder<>();
    }

    public static final class RestResultBuilder<T> {
        private int code;
        private String message;
        private T data;

        private RestResultBuilder() {}

        public RestResultBuilder<T> code(int code) {
            this.code = code;
            return this;
        }

        public RestResultBuilder<T> message(String message) {
            this.message = message;
            return this;
        }

        public RestResultBuilder<T> data(T data) {
            this.data = data;
            return this;
        }

        public RestResult<T> build() {
            RestResult<T> restResult = new RestResult<>();
            restResult.setCode(code);
            restResult.setMessage(message);
            restResult.setData(data);
            return restResult;
        }
    }

}
