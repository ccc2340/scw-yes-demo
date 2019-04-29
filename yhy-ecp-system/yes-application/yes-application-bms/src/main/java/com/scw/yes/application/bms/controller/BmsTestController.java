package com.scw.yes.application.bms.controller;

import com.alibaba.fastjson.JSONObject;
import com.scw.yes.common.core.enums.DefaultResultStatus;
import com.scw.yes.common.core.stereotype.ResponseResult;
import com.scw.yes.service.common.facade.feign.EmailApi;
import com.scw.yes.service.common.facade.feign.SmsApi;
import com.scw.yes.service.common.facade.request.SendEmailRequest;
import com.scw.yes.service.common.facade.request.SendSmsRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author chenguagxue
 * @CreateDate 2019-04-28 17:35
 */
@RestController
@RequestMapping(value = "/bms")
public class BmsTestController {

    @Autowired
    private SmsApi smsApi;
    @Autowired
    private EmailApi emailApi;

    @RequestMapping(value = "/test")
    public ResponseResult<JSONObject> test() {
        JSONObject jsonObject = new JSONObject();

        SendSmsRequest sendSmsRequest = SendSmsRequest.of("17338600226", "测试短信");
        ResponseResult<Void> sendSms = smsApi.sendSms(sendSmsRequest);

        SendEmailRequest sendEmailRequest = new SendEmailRequest();
        sendEmailRequest.setEmail("1045550775@qq.com");
        sendEmailRequest.setContent("测试邮件");
        ResponseResult<Void> sendEmail = emailApi.sendEmail(sendEmailRequest);

        jsonObject.put("sendSms", sendSms.isSuccess());
        jsonObject.put("sendEmail", sendEmail.isSuccess());

        return DefaultResultStatus.HANDLE_SUCCESS.toResult(jsonObject);
    }
}
