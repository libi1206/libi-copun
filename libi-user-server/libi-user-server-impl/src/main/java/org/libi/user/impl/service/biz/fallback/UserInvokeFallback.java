package org.libi.user.impl.service.biz.fallback;

import lombok.extern.slf4j.Slf4j;
import org.libi.user.api.model.vo.UserInfoVO;

/**
 * @author :Libi
 * @version :1.0
 * @date :3/12/22 8:23 PM
 */
@Slf4j
public class UserInvokeFallback {
    public static UserInfoVO getUserByPhone(String phone) {
        System.out.println("触发降级，getUserByPhone");
        return null;
    }

    public static UserInfoVO getUserById(String id) {
        System.out.println("触发降级，getUserById");
        return null;
    }

    public static UserInfoVO getUserByPhoneBlocked(String phone) {
        System.out.println("触发限流，getUserByPhone");
        return null;
    }

    public static UserInfoVO getUserByIdBlocked(String id) {
        System.out.println("触发限流，getUserById");
        return null;
    }
}
