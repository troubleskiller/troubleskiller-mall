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
 * @date 2022-11-21 16:04:57
 */
@Data
@TableName("subsystem")
public class SubsystemEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String id;
	/**
	 * 
	 */
	private String code;
	/**
	 * 
	 */
	private String name;
	/**
	 * 
	 */
	private String url;
	/**
	 * 
	 */
	private String orderBy;
	/**
	 * 
	 */
	private String remark;
	/**
	 * 
	 */
	private String state;
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
	private String createrId;
	/**
	 * 
	 */
	private String updateId;

}
