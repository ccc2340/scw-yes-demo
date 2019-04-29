package com.scw.yes.service.common.facade.request;

import com.scw.yes.common.core.field.Phone;
import com.scw.yes.common.core.stereotype.RequestObject;
import lombok.Data;

/**
 * @Description
 * @Author chenguagxue
 * @CreateDate 2019-04-28 18:26
 */
@Data
public class SendSmsRequest implements RequestObject, Phone {

    private String phone;
    private String content;

    public static SendSmsRequest of(String phone, String content) {
        SendSmsRequest request = new SendSmsRequest();
        request.phone = phone;
        request.content = content;
        return request;
    }
}
