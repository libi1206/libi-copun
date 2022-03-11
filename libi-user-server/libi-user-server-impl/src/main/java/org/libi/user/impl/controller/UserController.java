package org.libi.user.impl.controller;

import java.util.Arrays;
import java.util.Map;

import org.libi.user.api.model.vo.UserInfoVO;
import org.libi.user.impl.entity.UserDo;
import org.libi.user.impl.service.UserService;
import org.libi.user.impl.service.biz.UserBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author libi
 * @email sunlightcs@gmail.com
 * @date 2022-03-10 23:31:24
 */
@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserBusinessService userService;

}
