package com.hz.pojo;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import org.hibernate.annotations.Entity;
import javax.persistence.*;

@Entity
@Table(name = "user")
@Data
public class User implements Serializable{

	private static final long serialVersionUID =  5875693882498909037L;

	/**
	 * 用户ID
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@TableId(type = IdType.AUTO)
	@Column(name = "user_id")
	private Long userId;

	/**
	 * 用户名
	 */
	@Column(name = "user_name")
	private String userName;

	/**
	 * 用户密码
	 */
	@Column(name = "user_password")
	private String userPassword;

	/**
	 * 性别(0男 1女)
	 */
	@Column(name = "user_sex")
	private Long userSex;

	/**
	 * 年龄
	 */
	@Column(name = "user_age")
	private Long userAge;

	/**
	 * 电话
	 */
	@Column(name = "user_phone")
	private String userPhone;

	/**
	 * 地址(省/市/区)
	 */
	@Column(name = "user_address")
	private String userAddress;

	/**
	 * 是否实名认证(0否 1是)
	 */
	@Column(name = "user_autonym")
	private Long userAutonym;

	/**
	 * 头像
	 */
	@Column(name = "user_head")
	private String userHead;

	/**
	 * 其他认证(救助队/寄养家庭认证)
	 */
	@Column(name = "user_approve")
	private String userApprove;

	/**
	 * 宠物(默认0只 无宠物)
	 */
	@Column(name = "user_pets")
	private Long userPets;

	/**
	 * 评论（编号）（评论表获取ID）
	 */
	@Column(name = "user_comment")
	private Long userComment;

	/**
	 * 注册时间
	 */
	@Column(name = "user_time")
	private String userTime;

	/**
	 * 用户状态
	 */
	@Column(name = "user_state")
	private Long userState;

}
