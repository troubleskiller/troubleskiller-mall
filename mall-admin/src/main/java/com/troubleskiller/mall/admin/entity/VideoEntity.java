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
 * @date 2022-11-21 16:04:59
 */
@Data
@TableName("video")
public class VideoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String id;
	/**
	 * 
	 */
	private String title;
	/**
	 * 
	 */
	private String categoryId;
	/**
	 * 
	 */
	private Integer thumbs;
	/**
	 * 
	 */
	private String memo;
	/**
	 * 
	 */
	private String url;
	/**
	 * 
	 */
	private Date createTime;
	/**
	 * 
	 */
	private String createrId;

}
