package com.hz.pojo;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import org.hibernate.annotations.Entity;
import javax.persistence.*;

@Entity
@Table(name = "orderson")
@Data
public class Orderson implements Serializable{

	private static final long serialVersionUID =  2334609618689828493L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@TableId(type = IdType.AUTO)
	@Column(name = "orderson_id")
	private Long ordersonId;

	/**
	 * 订单ID
	 */
	@Column(name = "orderson_order_id")
	private Long ordersonOrderId;

	/**
	 * 购买商品ID
	 */
	@Column(name = "orderson_goods_id")
	private Long ordersonGoodsId;

	/**
	 * 商品名称
	 */
	@Column(name = "orderson_goods_name")
	private String ordersonGoodsName;

	/**
	 * 商品单价
	 */
	@Column(name = "orderson_size_price")
	private double ordersonSizePrice;

	/**
	 * 商品图片
	 */
	@Column(name = "orderson_commodity_img")
	private String ordersonCommodityImg;

	/**
	 * 购买数量
	 */
	@Column(name = "orderson_count")
	private Long ordersonCount;

	/**
	 * 购买总价
	 */
	@Column(name = "orderson_price")
	private double ordersonPrice;

}
