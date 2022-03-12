package org.libi.user.impl.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.libi.user.api.model.vo.UserInfoVO;
import org.libi.user.impl.service.biz.UserBusinessService;
import org.libi.user.impl.service.biz.fallback.UserInvokeFallback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :Libi
 * @version :1.0
 * @date :3/11/22 10:27 PM
 * 仅仅进行内部调用的controller
 */
@RestController
@RequestMapping("/invoke/user")
public class UserInvokeController {
    @Autowired
    private UserBusinessService userBusinessService;

    @GetMapping("/phone")
    @SentinelResource(value = "getUserByPhone", fallbackClass = UserInvokeFallback.class, fallback = "getUserByPhone", blockHandlerClass = UserInvokeFallback.class, blockHandler = "getUserByPhone")
    public UserInfoVO getUserByPhone(@RequestParam String phone) {
        return userBusinessService.selectByPhone(phone);
    }

    @GetMapping("id")
    @SentinelResource(value = "getUserById", fallbackClass = UserInvokeFallback.class, fallback = "getUserById", blockHandlerClass = UserInvokeFallback.class, blockHandler = "getUserById")
    public UserInfoVO getUserById(@RequestParam String id) {
        return userBusinessService.selectInfoById(id);
    }
}
