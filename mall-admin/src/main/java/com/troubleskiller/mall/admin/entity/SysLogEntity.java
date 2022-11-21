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
@TableName("sys_log")
public class SysLogEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 日志ID
	 */
	@TableId
	private String id;
	/**
	 * 用户名字
	 */
	private String userId;
	/**
	 * 用户IP
	 */
	private String userIp;
	/**
	 * 请求方法
	 */
	private String requestClass;
	/**
	 * 请求方法
	 */
	private String requestMethod;
	/**
	 * 方法描述
	 */
	private String requestDesc;
	/**
	 * 
	 */
	private Date createTime;

}
