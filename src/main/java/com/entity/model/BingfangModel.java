package com.entity.model;

import com.entity.BingfangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 病房信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class BingfangModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 病房编号
     */
    private String bingfangUuidNumber;


    /**
     * 病房名称
     */
    private String bingfangName;


    /**
     * 病房图片
     */
    private String bingfangPhoto;


    /**
     * 病房价格
     */
    private Double bingfangNewMoney;


    /**
     * 病房数量
     */
    private Integer bingfangKucunNumber;


    /**
     * 病房类型
     */
    private Integer bingfangTypes;


    /**
     * 病房详情
     */
    private String bingfangContent;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 获取：病房编号
	 */
    public String getBingfangUuidNumber() {
        return bingfangUuidNumber;
    }


    /**
	 * 设置：病房编号
	 */
    public void setBingfangUuidNumber(String bingfangUuidNumber) {
        this.bingfangUuidNumber = bingfangUuidNumber;
    }
    /**
	 * 获取：病房名称
	 */
    public String getBingfangName() {
        return bingfangName;
    }


    /**
	 * 设置：病房名称
	 */
    public void setBingfangName(String bingfangName) {
        this.bingfangName = bingfangName;
    }
    /**
	 * 获取：病房图片
	 */
    public String getBingfangPhoto() {
        return bingfangPhoto;
    }


    /**
	 * 设置：病房图片
	 */
    public void setBingfangPhoto(String bingfangPhoto) {
        this.bingfangPhoto = bingfangPhoto;
    }
    /**
	 * 获取：病房价格
	 */
    public Double getBingfangNewMoney() {
        return bingfangNewMoney;
    }


    /**
	 * 设置：病房价格
	 */
    public void setBingfangNewMoney(Double bingfangNewMoney) {
        this.bingfangNewMoney = bingfangNewMoney;
    }
    /**
	 * 获取：病房数量
	 */
    public Integer getBingfangKucunNumber() {
        return bingfangKucunNumber;
    }


    /**
	 * 设置：病房数量
	 */
    public void setBingfangKucunNumber(Integer bingfangKucunNumber) {
        this.bingfangKucunNumber = bingfangKucunNumber;
    }
    /**
	 * 获取：病房类型
	 */
    public Integer getBingfangTypes() {
        return bingfangTypes;
    }


    /**
	 * 设置：病房类型
	 */
    public void setBingfangTypes(Integer bingfangTypes) {
        this.bingfangTypes = bingfangTypes;
    }
    /**
	 * 获取：病房详情
	 */
    public String getBingfangContent() {
        return bingfangContent;
    }


    /**
	 * 设置：病房详情
	 */
    public void setBingfangContent(String bingfangContent) {
        this.bingfangContent = bingfangContent;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
