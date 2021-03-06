package com.onnoa.shop.demo.authority.system.exception;

import com.onnoa.shop.common.exception.ServiceException;

/**
 * @Description:
 * @Author: onnoA
 * @Date: 2020/6/4 15:12
 */
public class UserException extends ServiceException {

    public static final ServiceException USER_NOT_EXITS = new ServiceException(400010001, "用户不存在,用户名为:{0}！");
    public static final ServiceException USER_VERIFY_CODE_FAILURE = new ServiceException(400010002, "用户验证码失效！");
    public static final ServiceException USER_VERIFY_CODE_ERROR = new ServiceException(400010003, "用户验证码错误！");
    public static final ServiceException USER_PASSWORD_WRONG = new ServiceException(400010004, "用户密码错误！");
    public static final ServiceException ACCESS_TOKEN_HAS_EXPIRED = new ServiceException(400010005, "accessToken已过期！");
    public static final ServiceException USERID_AUTH_NOT_PASSED = new ServiceException(400010006, "用户ID验证不通过！");
    public static final ServiceException USER_HAS_NOT_PERMISSION = new ServiceException(400010007, "用户没有该权限！");
    public static final ServiceException DATA_INVALID = new ServiceException(400010008, "{0}");

    protected int code;
    protected String msg;

    protected UserException(Integer code, String msg) {
        super(code, msg);
    }


    @Override
    public String toString() {
        return String.format("业务异常=%s, code=%s, msg=%s", this.getClass().getSimpleName(), this.code,
                this.msg);
    }
}
