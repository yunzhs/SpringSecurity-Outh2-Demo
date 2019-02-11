package com.transinfo.security.entity;

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
 * @since 2019-02-01
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Role extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableField("ID")
    private Integer id;

    @TableField("ROLE_NAME")
    private String roleName;

    @TableField("AUTH")
    private String auth;


}
