package com.transinfo.security.entity.security;

import java.sql.Blob;

import com.baomidou.mybatisplus.annotation.TableId;
import com.transinfo.security.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;

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
public class OauthAccessToken extends BaseEntity {

    private static final long serialVersionUID = 1L;
    @TableId
    private String tokenId;

    private Blob token;

    private String authenticationId;

    private String userName;

    private String clientId;

    private Blob authentication;

    private String refreshToken;


}
