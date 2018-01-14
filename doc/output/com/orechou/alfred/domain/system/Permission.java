package com.orechou.alfred.domain.system;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 系统权限
 * </p>
 *
 * @author OreChou
 * @since 2018-01-14
 */
@Data
@EqualsAndHashCode()
@Accessors(chain = true)
@TableName("sys_permission")
public class Permission extends Model<Permission> {

    private static final long serialVersionUID = 1L;

    @TableId("permission_id")
	private Long permissionId;
    /**
     * 权限名称
     */
	private String name;
    /**
     * 授权(多个用逗号分隔，如：user:list,user:create)
     */
	private String perms;
    /**
     * 备注
     */
	private String remark;
	@TableField("create_time")
	private Date createTime;
    /**
     * 排序
     */
	@TableField("order_num")
	private Integer orderNum;
	private String icon;


	@Override
	protected Serializable pkVal() {
		return this.permissionId;
	}

}
