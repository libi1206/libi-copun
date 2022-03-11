package org.libi.user.impl.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.libi.user.impl.dao.UserDao;
import org.libi.user.impl.entity.UserDo;
import org.libi.user.impl.service.UserService;
import org.springframework.stereotype.Service;

/**
 *
 * @author  libi
 * @description 
 * @date 2022-03-10 23:31:24
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, UserDo> implements UserService {

}
