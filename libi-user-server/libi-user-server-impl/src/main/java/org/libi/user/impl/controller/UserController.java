package org.libi.user.impl.controller;

import org.libi.user.impl.service.biz.UserBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author libi
 * @date 2022-03-10 23:31:24
 *
 * 提供接口的controller
 */
@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserBusinessService userService;

}
