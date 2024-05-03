package com.entity.model;

import com.entity.YishengOrderEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 急诊预约
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class YishengOrderModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 医生
     */
    private Integer yishengId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 就诊识别码
     */
    private String yishengOrderUuinNumber;


    /**
     * 预约时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date yishengOrderTime;


    /**
     * 时间类型
     */
    private Integer yishengOrderTypes;


    /**
     * 患者症状
     */
    private String yishengOrderText;


    /**
     * 预约状态
     */
    private Integer yishengOrderStatusTypes;


    /**
     * 预约审核
     */
    private Integer yishengOrderYesnoTypes;


    /**
     * 审核结果
     */
    private String yishengOrderYesnoText;


    /**
     * 创建时间 show3
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：医生
	 */
    public Integer getYishengId() {
        return yishengId;
    }


    /**
	 * 设置：医生
	 */
    public void setYishengId(Integer yishengId) {
        this.yishengId = yishengId;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：就诊识别码
	 */
    public String getYishengOrderUuinNumber() {
        return yishengOrderUuinNumber;
    }


    /**
	 * 设置：就诊识别码
	 */
    public void setYishengOrderUuinNumber(String yishengOrderUuinNumber) {
        this.yishengOrderUuinNumber = yishengOrderUuinNumber;
    }
    /**
	 * 获取：预约时间
	 */
    public Date getYishengOrderTime() {
        return yishengOrderTime;
    }


    /**
	 * 设置：预约时间
	 */
    public void setYishengOrderTime(Date yishengOrderTime) {
        this.yishengOrderTime = yishengOrderTime;
    }
    /**
	 * 获取：时间类型
	 */
    public Integer getYishengOrderTypes() {
        return yishengOrderTypes;
    }


    /**
	 * 设置：时间类型
	 */
    public void setYishengOrderTypes(Integer yishengOrderTypes) {
        this.yishengOrderTypes = yishengOrderTypes;
    }
    /**
	 * 获取：患者症状
	 */
    public String getYishengOrderText() {
        return yishengOrderText;
    }


    /**
	 * 设置：患者症状
	 */
    public void setYishengOrderText(String yishengOrderText) {
        this.yishengOrderText = yishengOrderText;
    }
    /**
	 * 获取：预约状态
	 */
    public Integer getYishengOrderStatusTypes() {
        return yishengOrderStatusTypes;
    }


    /**
	 * 设置：预约状态
	 */
    public void setYishengOrderStatusTypes(Integer yishengOrderStatusTypes) {
        this.yishengOrderStatusTypes = yishengOrderStatusTypes;
    }
    /**
	 * 获取：预约审核
	 */
    public Integer getYishengOrderYesnoTypes() {
        return yishengOrderYesnoTypes;
    }


    /**
	 * 设置：预约审核
	 */
    public void setYishengOrderYesnoTypes(Integer yishengOrderYesnoTypes) {
        this.yishengOrderYesnoTypes = yishengOrderYesnoTypes;
    }
    /**
	 * 获取：审核结果
	 */
    public String getYishengOrderYesnoText() {
        return yishengOrderYesnoText;
    }


    /**
	 * 设置：审核结果
	 */
    public void setYishengOrderYesnoText(String yishengOrderYesnoText) {
        this.yishengOrderYesnoText = yishengOrderYesnoText;
    }
    /**
	 * 获取：创建时间 show3
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show3
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
