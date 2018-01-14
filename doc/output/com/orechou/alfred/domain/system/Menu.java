package com.orechou.alfred.domain.system;

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
 * 
 * </p>
 *
 * @author OreChou
 * @since 2018-01-14
 */
@Data
@EqualsAndHashCode()
@Accessors(chain = true)
@TableName("sys_menu")
public class Menu extends Model<Menu> {

    private static final long serialVersionUID = 1L;

    /**
     * 菜单id
     */
    @TableId("menu_id")
	private Long menuId;
    /**
     * 名称
     */
	private String name;
    /**
     * 上级菜单id
     */
	@TableField("parent_id")
	private Long parentId;
    /**
     * url
     */
	private String url;
    /**
     * 类型   0：目录   1：菜单   2：按钮
     */
	private Integer type;
    /**
     * 备注
     */
	private String remark;
    /**
     * 图标
     */
	private String icon;


	@Override
	protected Serializable pkVal() {
		return this.menuId;
	}

}
