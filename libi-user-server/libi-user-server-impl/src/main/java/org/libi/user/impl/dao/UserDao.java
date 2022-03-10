package org.libi.user.impl.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.libi.user.impl.entity.UserDo;

/**
 *
 *@author libi
 *@description 
 *@date 2022-03-10 23:31:24
 */
@Mapper
public interface UserDao extends BaseMapper<UserDo> {

}
