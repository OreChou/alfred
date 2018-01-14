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
 * 用户角色对应关系
 * </p>
 *
 * @author OreChou
 * @since 2018-01-14
 */
@Data
@EqualsAndHashCode()
@Accessors(chain = true)
@TableName("sys_user_role")
public class UserRole extends Model<UserRole> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
	private Long id;
    /**
     * 用户id
     */
	@TableField("sys_user_id")
	private Long sysUserId;
    /**
     * 角色id
     */
	@TableField("sys_role_id")
	private Long sysRoleId;


	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
