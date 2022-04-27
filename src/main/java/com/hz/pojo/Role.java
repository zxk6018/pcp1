package com.hz.pojo;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import org.hibernate.annotations.Entity;
import javax.persistence.*;

@Entity
@Table(name = "role")
@Data
public class Role implements Serializable{

	private static final long serialVersionUID =  921437566324718259L;

	/**
	 * 角色ID
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@TableId(type = IdType.AUTO)
	@Column(name = "role_id")
	private Long roleId;

	/**
	 * 角色名称
	 */
	@Column(name = "role_name")
	private String roleName;

	/**
	 * 角色权限描述
	 */
	@Column(name = "role_desc")
	private String roleDesc;

	/**
	 * 创建人ID(父级ID）
	 */
	@Column(name = "role_role_id")
	private Long roleRoleId;

	/**
	 * 创建时间
	 */
	@Column(name = "role_time")
	private String roleTime;

	/**
	 * 状态（默认为0）
	 */
	@Column(name = "role_state")
	private Long roleState;

}
