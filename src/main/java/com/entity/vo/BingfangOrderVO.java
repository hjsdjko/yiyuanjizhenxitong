package com.entity.vo;

import com.entity.BingfangOrderEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 病房预约
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("bingfang_order")
public class BingfangOrderVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 病房
     */

    @TableField(value = "bingfang_id")
    private Integer bingfangId;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 预约时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "bingfang_order_time")
    private Date bingfangOrderTime;


    /**
     * 备注
     */

    @TableField(value = "bingfang_order_text")
    private String bingfangOrderText;


    /**
     * 创建时间 show3
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：病房
	 */
    public Integer getBingfangId() {
        return bingfangId;
    }


    /**
	 * 获取：病房
	 */

    public void setBingfangId(Integer bingfangId) {
        this.bingfangId = bingfangId;
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
	 * 设置：预约时间
	 */
    public Date getBingfangOrderTime() {
        return bingfangOrderTime;
    }


    /**
	 * 获取：预约时间
	 */

    public void setBingfangOrderTime(Date bingfangOrderTime) {
        this.bingfangOrderTime = bingfangOrderTime;
    }
    /**
	 * 设置：备注
	 */
    public String getBingfangOrderText() {
        return bingfangOrderText;
    }


    /**
	 * 获取：备注
	 */

    public void setBingfangOrderText(String bingfangOrderText) {
        this.bingfangOrderText = bingfangOrderText;
    }
    /**
	 * 设置：创建时间 show3
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show3
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
