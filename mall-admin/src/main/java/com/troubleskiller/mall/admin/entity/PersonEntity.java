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
 * @date 2022-11-21 16:05:03
 */
@Data
@TableName("person")
public class PersonEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String id;
	/**
	 * 
	 */
	private String userId;
	/**
	 * 
	 */
	private String nickName;
	/**
	 * 
	 */
	private String avatarUrl;
	/**
	 * 
	 */
	private String gender;
	/**
	 * 
	 */
	private String country;
	/**
	 * 
	 */
	private String province;
	/**
	 * 
	 */
	private String city;
	/**
	 * 
	 */
	private String name;
	/**
	 * 
	 */
	private String school;
	/**
	 * 
	 */
	private String major;
	/**
	 * 
	 */
	private String birthday;
	/**
	 * 
	 */
	private String entrance;
	/**
	 * 
	 */
	private String hometown;
	/**
	 * 
	 */
	private String memo;
	/**
	 * 
	 */
	private String deptId;
	/**
	 * 
	 */
	private Date createTime;
	/**
	 * 
	 */
	private Date updateTime;

}
