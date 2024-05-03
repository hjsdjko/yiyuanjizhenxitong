package com.entity.view;

import com.entity.BingfangOrderEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 病房预约
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("bingfang_order")
public class BingfangOrderView extends BingfangOrderEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 bingfang
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
				* 病房类型的值
				*/
				private String bingfangValue;
			/**
			* 病房详情
			*/
			private String bingfangContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 余额
			*/
			private Double newMoney;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public BingfangOrderView() {

	}

	public BingfangOrderView(BingfangOrderEntity bingfangOrderEntity) {
		try {
			BeanUtils.copyProperties(this, bingfangOrderEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}







				//级联表的get和set bingfang

					/**
					* 获取： 病房编号
					*/
					public String getBingfangUuidNumber() {
						return bingfangUuidNumber;
					}
					/**
					* 设置： 病房编号
					*/
					public void setBingfangUuidNumber(String bingfangUuidNumber) {
						this.bingfangUuidNumber = bingfangUuidNumber;
					}

					/**
					* 获取： 病房名称
					*/
					public String getBingfangName() {
						return bingfangName;
					}
					/**
					* 设置： 病房名称
					*/
					public void setBingfangName(String bingfangName) {
						this.bingfangName = bingfangName;
					}

					/**
					* 获取： 病房图片
					*/
					public String getBingfangPhoto() {
						return bingfangPhoto;
					}
					/**
					* 设置： 病房图片
					*/
					public void setBingfangPhoto(String bingfangPhoto) {
						this.bingfangPhoto = bingfangPhoto;
					}

					/**
					* 获取： 病房价格
					*/
					public Double getBingfangNewMoney() {
						return bingfangNewMoney;
					}
					/**
					* 设置： 病房价格
					*/
					public void setBingfangNewMoney(Double bingfangNewMoney) {
						this.bingfangNewMoney = bingfangNewMoney;
					}

					/**
					* 获取： 病房数量
					*/
					public Integer getBingfangKucunNumber() {
						return bingfangKucunNumber;
					}
					/**
					* 设置： 病房数量
					*/
					public void setBingfangKucunNumber(Integer bingfangKucunNumber) {
						this.bingfangKucunNumber = bingfangKucunNumber;
					}

					/**
					* 获取： 病房类型
					*/
					public Integer getBingfangTypes() {
						return bingfangTypes;
					}
					/**
					* 设置： 病房类型
					*/
					public void setBingfangTypes(Integer bingfangTypes) {
						this.bingfangTypes = bingfangTypes;
					}


						/**
						* 获取： 病房类型的值
						*/
						public String getBingfangValue() {
							return bingfangValue;
						}
						/**
						* 设置： 病房类型的值
						*/
						public void setBingfangValue(String bingfangValue) {
							this.bingfangValue = bingfangValue;
						}

					/**
					* 获取： 病房详情
					*/
					public String getBingfangContent() {
						return bingfangContent;
					}
					/**
					* 设置： 病房详情
					*/
					public void setBingfangContent(String bingfangContent) {
						this.bingfangContent = bingfangContent;
					}

























				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}

					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 余额
					*/
					public Double getNewMoney() {
						return newMoney;
					}
					/**
					* 设置： 余额
					*/
					public void setNewMoney(Double newMoney) {
						this.newMoney = newMoney;
					}

					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}






}
