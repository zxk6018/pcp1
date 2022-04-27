package com.hz.pojo;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import org.hibernate.annotations.Entity;
import javax.persistence.*;

@Entity
@Table(name = "pet")
@Data
public class Pet implements Serializable{

	private static final long serialVersionUID =  3902183960692587970L;

	/**
	 * 宠物ID
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@TableId(type = IdType.AUTO)
	@Column(name = "pet_id")
	private Long petId;

	/**
	 * 宠物名
	 */
	@Column(name = "pet_name")
	private String petName;

	/**
	 * 宠物类型ID
	 */
	@Column(name = "pettype_id")
	private Long pettypeId;

	/**
	 * 品种名称
	 */
	@Column(name = "pettype_name")
	private String pettypeName;

	/**
	 * 宠物性别(0弟弟1妹妹)
	 */
	@Column(name = "pet_sex")
	private Long petSex;

	/**
	 * 所属用户ID
	 */
	@Column(name = "pet_user_id")
	private Long petUserId;

	/**
	 * 宠物年龄
	 */
	@Column(name = "pet_age")
	private Long petAge;

	/**
	 * 宠物图片
	 */
	@Column(name = "pet_img")
	private String petImg;

}
