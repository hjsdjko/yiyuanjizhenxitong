package com.entity.view;

import com.entity.BingfangEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 病房信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("bingfang")
public class BingfangView extends BingfangEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 病房类型的值
		*/
		private String bingfangValue;



	public BingfangView() {

	}

	public BingfangView(BingfangEntity bingfangEntity) {
		try {
			BeanUtils.copyProperties(this, bingfangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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













}
