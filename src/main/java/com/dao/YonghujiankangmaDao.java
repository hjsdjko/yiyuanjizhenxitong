package com.dao;

import com.entity.YonghujiankangmaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.YonghujiankangmaView;

/**
 * 用户健康码 Dao 接口
 *
 * @author 
 */
public interface YonghujiankangmaDao extends BaseMapper<YonghujiankangmaEntity> {

   List<YonghujiankangmaView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
