package org.libi.user.impl.service.biz;

import org.libi.user.api.model.vo.UserInfoVO;
import org.libi.user.impl.service.UserService;

/**
 * @author :Libi
 * @version :1.0
 * @date :3/11/22 1:49 PM
 */
public interface UserBusinessService extends UserService {

    UserInfoVO selectByPhone(String phone);

    UserInfoVO selectInfoById(String id);

}
