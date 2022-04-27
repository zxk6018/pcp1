package com.hz.pojo;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import org.hibernate.annotations.Entity;
import javax.persistence.*;

@Entity
@Table(name = "autho")
@Data
public class Autho implements Serializable{

	private static final long serialVersionUID =  6847739466502255406L;

	/**
	 * 权限ID
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@TableId(type = IdType.AUTO)
	@Column(name = "autho_id")
	private Long authoId;

	/**
	 * 权限名
	 */
	@Column(name = "autho_name")
	private String authoName;

}
