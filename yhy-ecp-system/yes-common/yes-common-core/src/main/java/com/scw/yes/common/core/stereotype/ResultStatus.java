package com.scw.yes.common.core.stereotype;

/**
 * @Description 代表操作结果的接口
 * @Author chenguagxue
 * @CreateDate 2019-04-28 16:30
 */
public interface ResultStatus {

    boolean isSuccess();

    String getCode();

    String getMessage();

    <T> ResponseResult<T> getDefaultResponseResult();

    default boolean fail() {
        return !isSuccess();
    }

    default <T> ResponseResult<T> toResult(String message, T data) {
        return ResponseResult.createFrom(this, message, data);
    }

    default <T> ResponseResult<T> toResult(T data) {
        return toResult(this.getMessage(), data);
    }

    default <T> ResponseResult<T> toResult(String message) {
        return toResult(message, null);
    }

    default <T> ResponseResult<T> toResult() {
        return this.getDefaultResponseResult();
    }
}
