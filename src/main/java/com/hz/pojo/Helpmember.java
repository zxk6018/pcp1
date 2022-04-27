package com.hz.pojo;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import org.hibernate.annotations.Entity;
import javax.persistence.*;

@Entity
@Table(name = "helpmember")
@Data
public class Helpmember implements Serializable{

	private static final long serialVersionUID =  9082694749308800949L;

	/**
	 * 队员ID
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@TableId(type = IdType.AUTO)
	@Column(name = "helpmember_id")
	private Long helpmemberId;

	/**
	 * 用户ID
	 */
	@Column(name = "helpmember_user_id")
	private Long helpmemberUserId;

	/**
	 * 救助队ID
	 */
	@Column(name = "helpmember_pethelp_id")
	private Long helpmemberPethelpId;

	/**
	 * 申请理由
	 */
	@Column(name = "helpmember_reason")
	private String helpmemberReason;

	/**
	 * 申请时间
	 */
	@Column(name = "helpmember_time")
	private String helpmemberTime;

	/**
	 * 电话
	 */
	@Column(name = "helpmember_phone")
	private Long helpmemberPhone;

	/**
	 * 真实姓名
	 */
	@Column(name = "helpmember_rname")
	private String helpmemberRname;

	/**
	 * 身份证号码
	 */
	@Column(name = "helpmember_idcard")
	private Long helpmemberIdcard;

	/**
	 * 照片
	 */
	@Column(name = "helpmember_img")
	private String helpmemberImg;

	/**
	 * 所在地址
	 */
	@Column(name = "helpmember_address")
	private String helpmemberAddress;

	/**
	 * 审核状态（0通过 1未通过）
	 */
	@Column(name = "helpmember_state")
	private Long helpmemberState;

	/**
	 * 处理人ID（用户ID  必须是救助队创建者）
	 */
	@Column(name = "helpmember_pethelp_admin_id")
	private Long helpmemberPethelpAdminId;

	/**
	 * 处理意见
	 */
	@Column(name = "helpmember_opinion")
	private String helpmemberOpinion;

	/**
	 * 处理时间
	 */
	@Column(name = "helpmember_disposetime")
	private String helpmemberDisposetime;

}
