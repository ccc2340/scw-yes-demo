package com.scw.yes.common.core.stereotype;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

/**
 * @Description
 * @Author chenguagxue
 * @CreateDate 2019-04-28 16:32
 */
@Getter
@Slf4j
public class ResponseResult<T> {

    private final boolean success;
    private final String code;
    private final String message;
    private final String timestamp;
    private final T data;

    private ResponseResult(boolean success, String code, String message, T data) {
        this.success = success;
        this.code = code;
        this.message = message;
        this.data = data;

        this.timestamp = String.valueOf(System.currentTimeMillis());
        log.info("创建对象：{}", this);
    }

    public static <T> ResponseResult<T> createFrom(ResultStatus status, String message, T data) {
        return new ResponseResult<>(status.isSuccess(), status.getCode(), message, data);
    }
}
