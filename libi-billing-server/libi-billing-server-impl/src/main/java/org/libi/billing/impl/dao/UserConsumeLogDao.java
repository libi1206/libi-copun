package org.libi.billing.impl.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.libi.billing.impl.entity.AdminUserConsumeLogDo;
import org.libi.billing.impl.entity.UserConsumeLogDo;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 *
 *@author wanghaifeng
 *@description 用户消费记录表
 *@date 2021-08-05 17:46:10
 */
@Mapper
@Repository
public interface UserConsumeLogDao extends BaseMapper<UserConsumeLogDo> {

    List<AdminUserConsumeLogDo> getLogListByAdmin(@Param("userIdList") List<String> userIdList, @Param("logTypeList") List<Integer> logTypeList, @Param("startTime") Date startTime, @Param("endTime") Date endTime);



    BigDecimal getTotalCost(@Param("userIdList") List<String> userIdList, @Param("logTypeList") List<Integer> logTypeList, @Param("startTime") Date startTime, @Param("endTime") Date endTime);


}
