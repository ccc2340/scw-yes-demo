package com.scw.yes.service.common.facade.feign;

import com.scw.yes.common.core.stereotype.ResponseResult;
import com.scw.yes.common.feign.constant.ApplicationNames;
import com.scw.yes.common.feign.constant.ControllerPath;
import com.scw.yes.service.common.facade.request.SendSmsRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Description
 * @Author chenguagxue
 * @CreateDate 2019-04-28 18:26
 */
@FeignClient(value = ApplicationNames.COMMON_SERVICE, path = ControllerPath.SMS_CONTROLLER)
public interface SmsApi {

    @PostMapping(value = "/send")
    ResponseResult<Void> sendSms(@RequestBody SendSmsRequest request);
}
