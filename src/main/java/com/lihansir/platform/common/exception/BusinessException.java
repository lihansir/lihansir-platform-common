/*
 * Copyright Li Han Holding.
 */

package com.lihansir.platform.common.exception;

import com.lihansir.platform.common.code.CommonCode;
import com.lihansir.platform.common.code.RestCode;

/**
 * <p>
 * General service exception
 * </p>
 *
 * @author <a href="https://www.lihansir.com">Li Han</a>
 * @date Created in 2020/10/03 10:44
 **/
public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = -2714635136932653280L;

    private int code;

    private String msg;

    public BusinessException(String msg) {
        super(msg);
        this.code = CommonCode.BUSINESS_EXECUTE_ERROR.getCode();
        this.msg = msg;
    }

    public BusinessException(int code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }

    public BusinessException(RestCode code) {
        super(code.getMsg());
        this.code = code.getCode();
        this.msg = code.getMsg();
    }

    public BusinessException(Throwable cause, RestCode code) {
        super(cause);
        this.code = code.getCode();
        this.msg = code.getMsg();
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

    @Override
    public String toString() {
        return "BusinessException{" + "code=" + code + ", msg='" + msg + '\'' + '}';
    }

}
