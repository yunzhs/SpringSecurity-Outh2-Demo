package com.transinfo.security.entity.security;

import java.time.LocalDateTime;
import com.transinfo.security.common.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author gyw
 * @since 2019-01-30
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class OauthApprovals extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableField("userId")
    private String userId;

    @TableField("clientId")
    private String clientId;

    private String scope;

    private String status;

    @TableField("expiresAt")
    private LocalDateTime expiresAt;

    @TableField("lastModifiedAt")
    private LocalDateTime lastModifiedAt;


}
