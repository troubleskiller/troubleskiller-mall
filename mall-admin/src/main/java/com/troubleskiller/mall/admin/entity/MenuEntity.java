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
 * @date 2022-11-21 16:05:00
 */
@Data
@TableName("menu")
public class MenuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String id;
	/**
	 * 
	 */
	private String name;
	/**
	 * 
	 */
	private String nameEn;
	/**
	 * 
	 */
	private String icon;
	/**
	 * 
	 */
	private String pid;
	/**
	 * 
	 */
	private String url;
	/**
	 * 
	 */
	private String module;
	/**
	 * 
	 */
	private String remark;
	/**
	 * 
	 */
	private Date createTime;
	/**
	 * 
	 */
	private Date updateTime;
	/**
	 * 
	 */
	private Integer orderBy;
	/**
	 * 
	 */
	private String subsystemId;

}
