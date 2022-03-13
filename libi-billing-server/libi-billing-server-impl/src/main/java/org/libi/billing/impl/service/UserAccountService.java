package org.libi.billing.impl.service;

import com.baomidou.mybatisplus.service.IService;
import org.libi.billing.api.constant.AccountType;
import org.libi.billing.impl.entity.UserAccountDo;

/**
 * @author wanghaifeng
 * @description 用户账户
 * @date 2021-09-01 14:09:46
 */
public interface UserAccountService extends IService<UserAccountDo> {

    /**
     * 根据账户类型获得账户信息
     *
     * @param userId
     * @param accountType
     * @return
     */
    UserAccountDo getByAccountType(String userId, Integer accountType);

    /**
     * 根据账户类型检查账户信息
     * 没有就抛出异常
     *
     * @param userId
     * @param accountType
     * @return
     */
    UserAccountDo checkByAccountType(String userId, Integer accountType);

    /**
     * 根据账户类型查询账户信息
     * 如果没有就进行账户创建
     * @param userId
     * @param accountType
     * @return
     */
    UserAccountDo checkAndCreateByAccountType(String userId, Integer accountType);

    /**
     * 根据账户类型检查账户信息
     *
     * @param userId
     * @param accountType
     * @return
     */
    void checkUserHasSufficientBalance(String userId, AccountType accountType);

}

