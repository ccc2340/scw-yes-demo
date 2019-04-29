package com.scw.yes.service.common.concrete.controller;

import com.scw.yes.common.core.enums.DefaultResultStatus;
import com.scw.yes.common.core.stereotype.ResponseResult;
import com.scw.yes.common.feign.constant.ControllerPath;
import com.scw.yes.service.common.facade.feign.EmailApi;
import com.scw.yes.service.common.facade.request.SendEmailRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author chenguagxue
 * @CreateDate 2019-04-28 18:55
 */
@RestController
@RequestMapping(value = ControllerPath.EMAIL_CONTROLLER)
@Slf4j
public class EmailApiController implements EmailApi {

    @Override
    public ResponseResult<Void> sendEmail(SendEmailRequest request) {
        log.info("请求发送邮件：{}", request.getEmail());
        return DefaultResultStatus.HANDLE_SUCCESS.toResult();
    }
}
