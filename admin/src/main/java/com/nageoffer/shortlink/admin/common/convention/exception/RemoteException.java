package com.nageoffer.shortlink.admin.common.convention.exception;

/**
 * @projectName: shortlink
 * @package: com.nageoffer.shortlink.admin.common.convention.exception
 * @className: RemoteException
 * @author: Feng Jingting
 * @description: TODO
 * @date: 2024/7/23 11:18
 * @version: 1.0
 */

import com.nageoffer.shortlink.admin.common.convention.errorcode.BaseErrorCode;
import com.nageoffer.shortlink.admin.common.convention.errorcode.IErrorCode;

/**
 * 远程服务调用异常
 */
public class RemoteException extends AbstractException {

    public RemoteException(String message) {
        this(message, null, BaseErrorCode.REMOTE_ERROR);
    }

    public RemoteException(String message, IErrorCode errorCode) {
        this(message, null, errorCode);
    }

    public RemoteException(String message, Throwable throwable, IErrorCode errorCode) {
        super(message, throwable, errorCode);
    }

    @Override
    public String toString() {
        return "RemoteException{" +
                "code='" + errorCode + "'," +
                "message='" + errorMessage + "'" +
                '}';
    }
}