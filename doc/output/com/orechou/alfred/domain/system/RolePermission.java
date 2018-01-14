package com.orechou.alfred.domain.system;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户权限关系表
 * </p>
 *
 * @author OreChou
 * @since 2018-01-14
 */
@Data
@EqualsAndHashCode()
@Accessors(chain = true)
@TableName("sys_role_permission")
public class RolePermission extends Model<RolePermission> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
	private Long id;
    /**
     * 角色id
     */
	@TableField("sys_role_id")
	private Long sysRoleId;
    /**
     * 权限id
     */
	@TableField("sys_permission_id")
	private Long sysPermissionId;


	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
