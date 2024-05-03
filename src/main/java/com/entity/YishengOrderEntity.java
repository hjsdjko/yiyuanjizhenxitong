package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 急诊预约
 *
 * @author 
 * @email
 */
@TableName("yisheng_order")
public class YishengOrderEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YishengOrderEntity() {

	}

	public YishengOrderEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 医生
     */
    @TableField(value = "yisheng_id")

    private Integer yishengId;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 就诊识别码
     */
    @TableField(value = "yisheng_order_uuin_number")

    private String yishengOrderUuinNumber;


    /**
     * 预约时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat
    @TableField(value = "yisheng_order_time")

    private Date yishengOrderTime;


    /**
     * 时间类型
     */
    @TableField(value = "yisheng_order_types")

    private Integer yishengOrderTypes;


    /**
     * 患者症状
     */
    @TableField(value = "yisheng_order_text")

    private String yishengOrderText;


    /**
     * 预约状态
     */
    @TableField(value = "yisheng_order_status_types")

    private Integer yishengOrderStatusTypes;


    /**
     * 预约审核
     */
    @TableField(value = "yisheng_order_yesno_types")

    private Integer yishengOrderYesnoTypes;


    /**
     * 审核结果
     */
    @TableField(value = "yisheng_order_yesno_text")

    private String yishengOrderYesnoText;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：医生
	 */
    public Integer getYishengId() {
        return yishengId;
    }
    /**
	 * 获取：医生
	 */

    public void setYishengId(Integer yishengId) {
        this.yishengId = yishengId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：就诊识别码
	 */
    public String getYishengOrderUuinNumber() {
        return yishengOrderUuinNumber;
    }
    /**
	 * 获取：就诊识别码
	 */

    public void setYishengOrderUuinNumber(String yishengOrderUuinNumber) {
        this.yishengOrderUuinNumber = yishengOrderUuinNumber;
    }
    /**
	 * 设置：预约时间
	 */
    public Date getYishengOrderTime() {
        return yishengOrderTime;
    }
    /**
	 * 获取：预约时间
	 */

    public void setYishengOrderTime(Date yishengOrderTime) {
        this.yishengOrderTime = yishengOrderTime;
    }
    /**
	 * 设置：时间类型
	 */
    public Integer getYishengOrderTypes() {
        return yishengOrderTypes;
    }
    /**
	 * 获取：时间类型
	 */

    public void setYishengOrderTypes(Integer yishengOrderTypes) {
        this.yishengOrderTypes = yishengOrderTypes;
    }
    /**
	 * 设置：患者症状
	 */
    public String getYishengOrderText() {
        return yishengOrderText;
    }
    /**
	 * 获取：患者症状
	 */

    public void setYishengOrderText(String yishengOrderText) {
        this.yishengOrderText = yishengOrderText;
    }
    /**
	 * 设置：预约状态
	 */
    public Integer getYishengOrderStatusTypes() {
        return yishengOrderStatusTypes;
    }
    /**
	 * 获取：预约状态
	 */

    public void setYishengOrderStatusTypes(Integer yishengOrderStatusTypes) {
        this.yishengOrderStatusTypes = yishengOrderStatusTypes;
    }
    /**
	 * 设置：预约审核
	 */
    public Integer getYishengOrderYesnoTypes() {
        return yishengOrderYesnoTypes;
    }
    /**
	 * 获取：预约审核
	 */

    public void setYishengOrderYesnoTypes(Integer yishengOrderYesnoTypes) {
        this.yishengOrderYesnoTypes = yishengOrderYesnoTypes;
    }
    /**
	 * 设置：审核结果
	 */
    public String getYishengOrderYesnoText() {
        return yishengOrderYesnoText;
    }
    /**
	 * 获取：审核结果
	 */

    public void setYishengOrderYesnoText(String yishengOrderYesnoText) {
        this.yishengOrderYesnoText = yishengOrderYesnoText;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "YishengOrder{" +
            "id=" + id +
            ", yishengId=" + yishengId +
            ", yonghuId=" + yonghuId +
            ", yishengOrderUuinNumber=" + yishengOrderUuinNumber +
            ", yishengOrderTime=" + yishengOrderTime +
            ", yishengOrderTypes=" + yishengOrderTypes +
            ", yishengOrderText=" + yishengOrderText +
            ", yishengOrderStatusTypes=" + yishengOrderStatusTypes +
            ", yishengOrderYesnoTypes=" + yishengOrderYesnoTypes +
            ", yishengOrderYesnoText=" + yishengOrderYesnoText +
            ", createTime=" + createTime +
        "}";
    }
}
