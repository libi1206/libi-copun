package org.libi.user.api.invoke;

import org.libi.user.api.model.vo.UserInfoVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author :Libi
 * @version :1.0
 * @date :3/11/22 10:27 PM
 * 仅仅进行内部调用的controller
 */
@FeignClient(value = "libi-user-server",path = "/invoke/user")
public interface UserInvokeController {
    @GetMapping("/phone")
    public UserInfoVO getUserByPhone(@RequestParam String phone);

    @GetMapping("id")
    public UserInfoVO getUserById(@RequestParam String id);
}
