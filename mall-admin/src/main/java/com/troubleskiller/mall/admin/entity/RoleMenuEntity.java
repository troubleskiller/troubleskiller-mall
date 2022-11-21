package com.troubleskiller.mall.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author troubleskiller
 * @email troubleskiller@outlook.com
 * @date 2022-11-21 16:05:02
 */
@Data
@TableName("role_menu")
public class RoleMenuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String menuId;
	/**
	 * 
	 */
	private String roleId;
	/**
	 * 
	 */
	private Date createTime;
	/**
	 * 
	 */
	private String createId;

}
