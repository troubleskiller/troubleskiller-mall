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
@TableName("article")
public class ArticleEntity implements Serializable {
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
	private String titleSub;
	/**
	 * 
	 */
	private String author;
	/**
	 * 
	 */
	private String status;
	/**
	 * 
	 */
	private String publishTime;
	/**
	 * 
	 */
	private Integer orderBy;
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
	/**
	 * 
	 */
	private String fileUrl;

}
