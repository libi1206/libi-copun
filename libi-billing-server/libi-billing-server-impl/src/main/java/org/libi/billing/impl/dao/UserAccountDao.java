package org.libi.billing.impl.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.libi.billing.api.model.query.BalanceQuery;
import org.libi.billing.impl.entity.UserAccountDo;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

/**
 * 用户账户表
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-07-28 20:05:39
 */
@Mapper
@Repository
public interface UserAccountDao extends BaseMapper<UserAccountDo> {

    /**
     * 查询用于指定账户的余额
     *
     * @param userId
     * @param accountType
     * @return
     */
    BalanceQuery findBalanceByUserAndAccountType(@Param("userId") String userId, @Param("accountType") Integer accountType);

    /**
     * 对指定账户余额进行扣费
     *
     * @param userId
     * @param accountType
     * @param cost
     */
    void decreaseAccountByUserId(@Param("userId") String userId, @Param("accountType") Integer accountType, @Param("cost") BigDecimal cost);

    /**
     * 增加账户余额根据用户id
     *
     * @param userId
     * @param accountType
     * @param changeBalance
     */
    void increaseAccountByUserId(@Param("userId") String userId, @Param("accountType") Integer accountType, @Param("changeBalance") BigDecimal changeBalance);

    /**
     *
     */

    /**
     * 根据用户id列表来获取账户信息
     *
     * @param userIdList
     * @param accountType
     * @return
     */
    List<UserAccountDo> getAccountInfoListByUserIdList(@Param("userIdList") List<String> userIdList, @Param("accountType") Integer accountType);

}
