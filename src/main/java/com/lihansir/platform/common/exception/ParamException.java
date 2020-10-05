/*
 * Copyright Li Han Holding.
 */

package com.lihansir.platform.common.exception;

import com.lihansir.platform.common.code.CommonCode;
import com.lihansir.platform.common.code.RestCode;

/**
 * <p>
 * Parameter verification error exception
 * </p>
 *
 * @author <a href="https://www.lihansir.com">Li Han</a>
 * @date Created in 2020/10/03 10:45
 **/
public class ParamException extends RuntimeException {

    private static final long serialVersionUID = 3496354170767422449L;

    private int code;

    private String msg;

    public ParamException(String msg) {
        super(msg);
        this.code = CommonCode.PARAM_CHECK_ERROR.getCode();
        this.msg = msg;
    }

    public ParamException(String paramName, String errMsg) {
        super(errMsg);
        this.msg = "Parameter：【" + paramName + "】" + errMsg;
    }

    public ParamException(RestCode restCode) {
        super(restCode.getMsg());
        this.msg = restCode.getMsg();
    }

    public ParamException(Throwable cause, String msg) {
        super(cause);
        this.msg = msg;
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
        return "ParamException{" + "code=" + code + ", msg='" + msg + '\'' + '}';
    }

}
