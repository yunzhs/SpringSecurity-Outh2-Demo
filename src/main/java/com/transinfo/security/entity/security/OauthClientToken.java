package com.transinfo.security.entity.security;

import java.sql.Blob;
import com.transinfo.security.common.BaseEntity;
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
public class OauthClientToken extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String tokenId;

    private Blob token;

    private String authenticationId;

    private String userName;

    private String clientId;


}
