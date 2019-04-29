package com.scw.yes.common.core.enums;

import com.scw.yes.common.core.stereotype.ResponseResult;
import com.scw.yes.common.core.stereotype.ResultStatus;
import lombok.Getter;

/**
 * @Description
 * @Author chenguagxue
 * @CreateDate 2019-04-28 16:43
 */
@Getter
public enum DefaultResultStatus implements ResultStatus {

    HANDLE_SUCCESS(true, "操作成功"),
    HANDLE_FAIL("操作失败"),
    ;

    private final boolean success;
    private final String code;
    private final String message;
    private final ResponseResult<?> defaultResponseResult;

    DefaultResultStatus(boolean success, String message) {
        this.success = success;
        this.code = this.name().toUpperCase();
        this.message = message;

        this.defaultResponseResult = ResponseResult.createFrom(this, message, null);
    }

    DefaultResultStatus(String message) {
        this(true, message);
    }
}
