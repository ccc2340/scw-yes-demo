package com.scw.yes.service.common.concrete.controller;

import com.scw.yes.common.core.enums.DefaultResultStatus;
import com.scw.yes.common.core.stereotype.ResponseResult;
import com.scw.yes.common.feign.constant.ControllerPath;
import com.scw.yes.service.common.facade.feign.SmsApi;
import com.scw.yes.service.common.facade.request.SendSmsRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author chenguagxue
 * @CreateDate 2019-04-28 18:44
 */
@RestController
@RequestMapping(value = ControllerPath.SMS_CONTROLLER)
@Slf4j
public class SmsApiController implements SmsApi {

    @Override
    public ResponseResult<Void> sendSms(SendSmsRequest request) {
        log.info("请求发送短信：{}", request.getPhone());
        return DefaultResultStatus.HANDLE_SUCCESS.toResult();
    }
}
