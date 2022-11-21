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
 * @date 2022-11-21 16:05:01
 */
@Data
@TableName("file")
public class FileEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String id;
	/**
	 * 
	 */
	private String bid;
	/**
	 * 
	 */
	private String name;
	/**
	 * 
	 */
	private String path;
	/**
	 * 
	 */
	private String type;
	/**
	 * 
	 */
	private Integer size;
	/**
	 * 
	 */
	private Date createTime;
	/**
	 * 
	 */
	private String createrId;

}
