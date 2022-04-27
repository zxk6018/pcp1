package com.hz.pojo;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import org.hibernate.annotations.Entity;
import javax.persistence.*;

@Entity
@Table(name = "circletype")
@Data
public class Circletype implements Serializable{

	private static final long serialVersionUID =  2087725446138778662L;

	/**
	 * 文章类型ID
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@TableId(value= "id",type = IdType.AUTO)
	@Column(name = "circletype_id")
	private Long circletypeId;

	/**
	 * 文章类型名
	 */
	@Column(name = "circletype_name")
	private String circletypeName;

	/**
	 * 创建时间
	 */
	@Column(name = "circletype_time")
	private String circletypeTime;

	/**
	 * 创建人ID
	 */
	@Column(name = "circletype_user_id")
	private Long circletypeUserId;

}
