package org.libi.billing.impl.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.libi.billing.impl.dao.UserAccountLogDao;
import org.libi.billing.impl.entity.UserAccountLogDo;
import org.libi.billing.impl.service.UserAccountLogService;
import org.springframework.stereotype.Service;

/**
 *
 * @author  wanghaifeng
 * @description 
 * @date 2021-09-01 14:09:46
 */
@Service("userAccountLogService" )
public class UserAccountLogServiceImpl extends ServiceImpl<UserAccountLogDao, UserAccountLogDo> implements UserAccountLogService {

}
