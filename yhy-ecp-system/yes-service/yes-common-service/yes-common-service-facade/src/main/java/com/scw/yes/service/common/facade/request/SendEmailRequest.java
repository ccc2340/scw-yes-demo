package com.scw.yes.service.common.facade.request;

import com.scw.yes.common.core.field.Email;
import com.scw.yes.common.core.stereotype.RequestObject;
import lombok.Data;

/**
 * @Description
 * @Author chenguagxue
 * @CreateDate 2019-04-28 18:56
 */
@Data
public class SendEmailRequest implements RequestObject, Email {

    private String email;
    private String content;
}
