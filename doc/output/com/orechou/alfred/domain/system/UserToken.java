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
 * 系统用户token
 * </p>
 *
 * @author OreChou
 * @since 2018-01-14
 */
@Data
@EqualsAndHashCode()
@Accessors(chain = true)
@TableName("sys_user_token")
public class UserToken extends Model<UserToken> {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    @TableId("user_id")
	private Long userId;
	private String token;
    /**
     * 过期时间
     */
	@TableField("expire_time")
	private Date expireTime;
    /**
     * 更新时间
     */
	@TableField("update_time")
	private Date updateTime;


	@Override
	protected Serializable pkVal() {
		return this.userId;
	}

}
