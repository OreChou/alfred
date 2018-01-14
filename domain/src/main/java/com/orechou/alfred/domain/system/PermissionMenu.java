package com.orechou.alfred.domain.system;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 权限菜单关系表
 * </p>
 *
 * @author OreChou
 * @since 2018-01-14
 */
@Data
@EqualsAndHashCode()
@Accessors(chain = true)
@TableName("sys_permission_menu")
public class PermissionMenu extends Model<PermissionMenu> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
	private Long id;
    /**
     * 权限id
     */
	@TableField("sys_permission_id")
	private Long sysPermissionId;
    /**
     * 菜单id
     */
	@TableField("sys_menu_id")
	private Long sysMenuId;


	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
