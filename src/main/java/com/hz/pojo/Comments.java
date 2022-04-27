package com.hz.pojo;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import org.hibernate.annotations.Entity;
import javax.persistence.*;

@Entity
@Table(name = "comments")
@Data
public class Comments implements Serializable{

	private static final long serialVersionUID =  7488704524774142546L;

	/**
	 * 评论ID
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@TableId(type = IdType.AUTO)
	@Column(name = "comments_id")
	private Long commentsId;

	/**
	 * 评论内容
	 */
	@Column(name = "comments_text")
	private String commentsText;

	/**
	 * 评论人ID
	 */
	@Column(name = "comments_user_id")
	private Long commentsUserId;

	/**
	 * 文章ID
	 */
	@Column(name = "comments_essay_id")
	private Long commentsEssayId;

	/**
	 * 评论时间
	 */
	@Column(name = "comments_time")
	private String commentsTime;

	/**
	 * 点赞数
	 */
	@Column(name = "comments_count")
	private Long commentsCount;

	/**
	 * 回复人ID
	 */
	@Column(name = "comments_byuser")
	private Long commentsByuser;

	/**
	 * 回复评论ID
	 */
	@Column(name = "comments_bytext")
	private Long commentsBytext;

}
