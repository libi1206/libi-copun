package org.libi.user.impl.service.biz.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import org.libi.common.constant.Code;
import org.libi.common.exctption.BusinessException;
import org.libi.user.api.constant.AuthStatus;
import org.libi.user.api.constant.AuthType;
import org.libi.user.api.model.vo.UserInfoVO;
import org.libi.user.impl.entity.UserDo;
import org.libi.user.impl.service.biz.UserBusinessService;
import org.libi.user.impl.service.impl.UserServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

/**
 * @author :Libi
 * @version :1.0
 * @date :3/11/22 2:18 PM
 */
@Service
public class UserBusinessServiceImpl extends UserServiceImpl implements UserBusinessService {
    @Override
    public UserInfoVO selectByPhone(String phone) {
        Wrapper<UserDo> wrapper = new EntityWrapper<>();
        wrapper.eq("phone", phone);
        UserDo userDo = selectOne(wrapper);
        return buildUserInfoVO(userDo);
    }

    @Override
    public UserInfoVO selectInfoById(String id) {
        if ("2".equals(id)) {
            throw new BusinessException(Code.ERROR);
        }
        UserDo userDo = selectById(id);
        return buildUserInfoVO(userDo);
    }

    private UserInfoVO buildUserInfoVO(UserDo userDo) {
        if (ObjectUtils.isEmpty(userDo)) {
            return null;
        }
        return UserInfoVO.builder()
                .id(userDo.getId())
                .phone(userDo.getPhone())
                .username(userDo.getUsername())
                .createTime(userDo.getCreateTime())
                .updateTime(userDo.getUpdateTime())
                .authType(AuthType.getAuthTypeByCode(userDo.getAuthType()))
                .authStatus(AuthStatus.getStatusByCodeInt(userDo.getAuthStatus())).build();
    }
}
