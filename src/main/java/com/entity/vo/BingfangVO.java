package com.entity.vo;

import com.entity.BingfangEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 病房信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("bingfang")
public class BingfangVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 病房编号
     */

    @TableField(value = "bingfang_uuid_number")
    private String bingfangUuidNumber;


    /**
     * 病房名称
     */

    @TableField(value = "bingfang_name")
    private String bingfangName;


    /**
     * 病房图片
     */

    @TableField(value = "bingfang_photo")
    private String bingfangPhoto;


    /**
     * 病房价格
     */

    @TableField(value = "bingfang_new_money")
    private Double bingfangNewMoney;


    /**
     * 病房数量
     */

    @TableField(value = "bingfang_kucun_number")
    private Integer bingfangKucunNumber;


    /**
     * 病房类型
     */

    @TableField(value = "bingfang_types")
    private Integer bingfangTypes;


    /**
     * 病房详情
     */

    @TableField(value = "bingfang_content")
    private String bingfangContent;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 设置：病房编号
	 */
    public String getBingfangUuidNumber() {
        return bingfangUuidNumber;
    }


    /**
	 * 获取：病房编号
	 */

    public void setBingfangUuidNumber(String bingfangUuidNumber) {
        this.bingfangUuidNumber = bingfangUuidNumber;
    }
    /**
	 * 设置：病房名称
	 */
    public String getBingfangName() {
        return bingfangName;
    }


    /**
	 * 获取：病房名称
	 */

    public void setBingfangName(String bingfangName) {
        this.bingfangName = bingfangName;
    }
    /**
	 * 设置：病房图片
	 */
    public String getBingfangPhoto() {
        return bingfangPhoto;
    }


    /**
	 * 获取：病房图片
	 */

    public void setBingfangPhoto(String bingfangPhoto) {
        this.bingfangPhoto = bingfangPhoto;
    }
    /**
	 * 设置：病房价格
	 */
    public Double getBingfangNewMoney() {
        return bingfangNewMoney;
    }


    /**
	 * 获取：病房价格
	 */

    public void setBingfangNewMoney(Double bingfangNewMoney) {
        this.bingfangNewMoney = bingfangNewMoney;
    }
    /**
	 * 设置：病房数量
	 */
    public Integer getBingfangKucunNumber() {
        return bingfangKucunNumber;
    }


    /**
	 * 获取：病房数量
	 */

    public void setBingfangKucunNumber(Integer bingfangKucunNumber) {
        this.bingfangKucunNumber = bingfangKucunNumber;
    }
    /**
	 * 设置：病房类型
	 */
    public Integer getBingfangTypes() {
        return bingfangTypes;
    }


    /**
	 * 获取：病房类型
	 */

    public void setBingfangTypes(Integer bingfangTypes) {
        this.bingfangTypes = bingfangTypes;
    }
    /**
	 * 设置：病房详情
	 */
    public String getBingfangContent() {
        return bingfangContent;
    }


    /**
	 * 获取：病房详情
	 */

    public void setBingfangContent(String bingfangContent) {
        this.bingfangContent = bingfangContent;
    }
    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
