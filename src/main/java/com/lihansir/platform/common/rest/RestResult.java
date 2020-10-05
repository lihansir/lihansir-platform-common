/*
 * Copyright Li Han Holding.
 */

package com.lihansir.platform.common.rest;

import com.lihansir.platform.common.code.CommonCode;
import com.lihansir.platform.common.code.RestCode;

import java.io.Serializable;

/**
 * <p>
 * Unified Response Object
 * </p>
 *
 * @author <a href="https://www.lihansir.com">Li Han</a>
 * @date Created in 2020/10/03 10:08
 **/
public class RestResult<T> implements Serializable {

    private static final long serialVersionUID = 892309986077110782L;

    private int code;
    private String msg;
    private T data;

    public RestResult() {}

    public RestResult(int code, String msg, T data) {
        this.code = code;
        this.setMsg(msg);
        this.data = data;
    }

    public RestResult(int code, T data) {
        this.code = code;
        this.data = data;
    }

    public RestResult(int code, String msg) {
        this.code = code;
        this.setMsg(msg);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean ok() {
        return this.code == 0 || this.code == 200;
    }

    @Override
    public String toString() {
        return "RestResult{" + "code=" + code + ", message='" + msg + '\'' + ", data=" + data + '}';
    }

    public static <T> RestResult<T> success() {
        return RestResult.<T>builder().code(CommonCode.OK.getCode()).msg(CommonCode.OK.getMsg()).build();
    }

    public static <T> RestResult<T> success(T data) {
        return RestResult.<T>builder().code(CommonCode.OK.getCode()).data(data).msg(CommonCode.OK.getMsg()).build();
    }

    public static <T> RestResult<T> success(int code, T data) {
        return RestResult.<T>builder().code(code).data(data).msg(CommonCode.OK.getMsg()).build();
    }

    public static <T> RestResult<T> failed() {
        return RestResult.<T>builder().code(CommonCode.FAILED.getCode()).msg(CommonCode.FAILED.getMsg()).build();
    }

    public static <T> RestResult<T> failed(String errMsg) {
        return RestResult.<T>builder().code(CommonCode.FAILED.getCode()).msg(errMsg).build();
    }

    public static <T> RestResult<T> failed(int code, T data) {
        return RestResult.<T>builder().code(code).data(data).msg(CommonCode.FAILED.getMsg()).build();
    }

    public static <T> RestResult<T> failed(RestCode restCode, T data) {
        return RestResult.<T>builder().code(restCode.getCode()).data(data).msg(restCode.getMsg()).build();
    }

    public static <T> RestResult<T> failed(RestCode restCode) {
        return RestResult.<T>builder().code(restCode.getCode()).msg(restCode.getMsg()).build();
    }

    public static <T> RestResult<T> failed(int code, T data, String errMsg) {
        return RestResult.<T>builder().code(code).data(data).msg(errMsg).build();
    }

    public static <T> RestResult<T> failedWithMsg(int code, String errMsg) {
        return RestResult.<T>builder().code(code).msg(errMsg).build();
    }

    public static <T> RestResultBuilder<T> builder() {
        return new RestResultBuilder<>();
    }

    public static final class RestResultBuilder<T> {
        private int code;
        private String msg;
        private T data;

        private RestResultBuilder() {}

        public RestResultBuilder<T> code(int code) {
            this.code = code;
            return this;
        }

        public RestResultBuilder<T> msg(String errMsg) {
            this.msg = errMsg;
            return this;
        }

        public RestResultBuilder<T> data(T data) {
            this.data = data;
            return this;
        }

        public RestResult<T> build() {
            RestResult<T> restResult = new RestResult<>();
            restResult.setCode(code);
            restResult.setMsg(msg);
            restResult.setData(data);
            return restResult;
        }
    }

}
