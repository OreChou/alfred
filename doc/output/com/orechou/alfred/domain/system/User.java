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
 * 系统用户
 * </p>
 *
 * @author OreChou
 * @since 2018-01-14
 */
@Data
@EqualsAndHashCode()
@Accessors(chain = true)
@TableName("sys_user")
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    @TableId("user_id")
	private Long userId;
    /**
     * 用户名
     */
	private String username;
    /**
     * 邮箱
     */
	private String email;
    /**
     * 手机号码
     */
	private String mobile;
    /**
     * 登陆密码
     */
	private String password;
    /**
     * 盐
     */
	private String salt;
	private Integer status;
    /**
     * 创建时间
     */
	@TableField("create_time")
	private Date createTime;
    /**
     * 更新时间
     */
	@TableField("update_time")
	private Date updateTime;
    /**
     * 登陆时间
     */
	@TableField("login_time")
	private Date loginTime;
    /**
     * 头像
     */
	private String icon;


	@Override
	protected Serializable pkVal() {
		return this.userId;
	}

}
