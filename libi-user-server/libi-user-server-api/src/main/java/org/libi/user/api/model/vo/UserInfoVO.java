package org.libi.user.api.model.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.libi.user.api.constant.AuthStatus;
import org.libi.user.api.constant.AuthType;

import java.util.Date;

/**
 * @author :Libi
 * @version :1.0
 * @date :3/11/22 1:49 PM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserInfoVO {
    private String id;
    private String phone;
    private String username;
    private Date createTime;
    private Date updateTime;
    private AuthType authType;
    private AuthStatus authStatus;
}
