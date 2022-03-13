package org.libi.billing.impl.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.libi.billing.api.model.vo.ConsumeCoinVO;
import org.libi.billing.api.model.vo.ConsumeLogVo;
import org.libi.billing.api.model.vo.RechargeCoinVO;
import org.libi.billing.impl.entity.UserAccountLogDo;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 用户账户流水表
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-07-28 20:05:38
 */
@Mapper
@Repository
public interface UserAccountLogDao extends BaseMapper<UserAccountLogDo> {

    List<ConsumeLogVo> selectConsumeLogsByUserId(@Param("userId") String userId, int limit, int pageSize, @Param("logNo") String logNo, @Param("startTime") Date startTime, @Param("endTime") Date endTime, @Param("refType") Integer refType);

    Long countConsumeLogsByUserId(@Param("userId") String userId, @Param("logNo") String logNo, @Param("startTime") Date startTime, @Param("endTime") Date endTime, @Param("refType") Integer refType);

    Long findReturnId(@Param("userId") String userId, @Param("evidenceId") String evidenceId, @Param("accountType") Integer accountType);

    /**
     * 获取指定时间段的印币变化总和
     * @param userId 用户id
     * @param isReturn 是否是回退的
     * @param direction 收入还是支出
     * @param startTime 开始时间
     * @param endTime 结束时间
     * @param refType refType 数据id所对应的表名
     * @param sceneType 场景值
     * @param returnIdList 排除在外的id列表，一般是回退的
     * @return
     */
    BigDecimal selectTotalChangeCoin(@Param("userId") String userId, @Param("isReturn") Integer isReturn, @Param("direction") Integer direction, @Param("startTime") Date startTime, @Param("endTime") Date endTime, @Param("refType") Integer refType, @Param("sceneType") Integer sceneType, @Param("returnIdList") List<Long> returnIdList);

    /**
     * 获取指定时间段的消耗印币的账户，以及该账户印币消费的总和（账户流水表，包含开放存取证）  LogScenesType=0
     * @param startTime 开始时间
     * @param endTime 结束时间
     * @return
     */
    List<ConsumeCoinVO> selectConsumeCoinUserIdList(@Param("startTime") Date startTime, @Param("endTime") Date endTime);

    /**
     * 获取指定时间段的充值印币的账户，以及该账户的充值次数以及充值印币数量  LogScenesType=1
     * @param startTime 开始时间
     * @param endTime 结束时间
     * @return
     */
    List<RechargeCoinVO> selectRechargeCoinUserIdList(@Param("startTime") Date startTime, @Param("endTime") Date endTime);
}
