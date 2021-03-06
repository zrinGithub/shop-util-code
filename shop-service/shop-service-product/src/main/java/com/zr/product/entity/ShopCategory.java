package com.zr.product.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 类别表
 * </p>
 *
 * @author zhangr
 * @since 2020-09-02
 */
@TableName("shop_category")
@Data
public class ShopCategory extends Model<ShopCategory> {

    private static final long serialVersionUID = 1L;

	/**
	 * 自增主键
	 */
	@TableId(type = IdType.UUID)
	@TableField(value="PK_ID")
	private Long pkId;

	/**
	 * 类别ID
	 */
	@TableField(value="CATEGORY_ID")
	private String categoryId;

	/**
	 * 类别名称
	 */
	@TableField(value="CATEGORY_NAME")
	private String categoryName;

	/**
	 * 类别等级
	 */
	@TableField(value="CATEGORY_LEVEL")
	private Integer categoryLevel;

	/**
	 * 父ID（一级分类的 PARENT_ID = 0）
	 */
	@TableField(value="PARENT_ID")
	private String parentId;

	/**
	 * 排序
	 */
	private Integer sort;

	/**
	 * 备注
	 */
	private String remark;

	/**
	 * 创建者
	 */
	@TableField(value="CREATE_BY")
	private String createBy;

	/**
	 * 创建时间
	 */
	@TableField(value="CREATE_TIME")
	private Date createTime;

	/**
	 * 修改者
	 */
	@TableField(value="MODIFY_BY")
	private String modifyBy;

	/**
	 * 修改时间
	 */
	@TableField(value="MODIFY_TIME")
	private Date modifyTime;

	/**
	 * 状态，0禁用，1启用
	 */
	@TableField(value="CATEGORY_STATUS")
	private Integer categoryStatus;

	/**
	 * 逻辑删除标记（0：正常，1：已删除）
	 */
	@TableField(value="DELETED_FLAG")
	private Integer deletedFlag;
}
