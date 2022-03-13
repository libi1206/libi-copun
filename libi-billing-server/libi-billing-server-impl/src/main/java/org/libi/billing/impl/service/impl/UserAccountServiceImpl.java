package org.libi.billing.impl.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.libi.billing.api.constant.AccountType;
import org.libi.billing.impl.dao.UserAccountDao;
import org.libi.billing.impl.entity.UserAccountDo;
import org.libi.billing.impl.service.UserAccountService;
import org.libi.common.constant.Code;
import org.libi.common.utils.AssertUtil;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.math.BigDecimal;

/**
 * @author wanghaifeng
 * @description 用户账户
 * @date 2021-09-01 14:09:46
 */
@Service("userAccountService")
public class UserAccountServiceImpl extends ServiceImpl<UserAccountDao, UserAccountDo> implements UserAccountService {

    @Override
    public UserAccountDo getByAccountType(String userId, Integer accountType) {
        Wrapper<UserAccountDo> userAccountDoWrapper = new EntityWrapper<>();
        userAccountDoWrapper.eq("user_id", userId);
        userAccountDoWrapper.eq("account_type", accountType);
        UserAccountDo userAccountDo = this.selectOne(userAccountDoWrapper);
        return userAccountDo;
    }

    @Override
    public UserAccountDo checkByAccountType(String userId, Integer accountType) {
        UserAccountDo userAccountDo = getByAccountType(userId, accountType);
        AssertUtil.isNUll(userAccountDo, Code.ACCOUNT_NOT_FOUNT);
        return userAccountDo;
    }

    @Override
    public UserAccountDo checkAndCreateByAccountType(String userId, Integer accountType) {
        UserAccountDo userAccountDo = getByAccountType(userId, accountType);
        if (ObjectUtils.isEmpty(userAccountDo)) {
            userAccountDo = new UserAccountDo();
            userAccountDo.setAccountType(AccountType.INK_COIN.getCode());
            userAccountDo.setUserId(userId);
            userAccountDo.setBalance(BigDecimal.ZERO);
            insert(userAccountDo);
        }
        return userAccountDo;
    }

    @Override
    public void checkUserHasSufficientBalance(String userId, AccountType accountType) {
        UserAccountDo userAccountDo = checkByAccountType(userId, accountType.getCode());

        AssertUtil.check(userAccountDo.getBalance().intValue() <1,Code.USER_ACCOUNT_BALANCE_INSUFFICIENT);
    }
}
