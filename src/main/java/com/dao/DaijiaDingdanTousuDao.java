package com.dao;

import com.entity.DaijiaDingdanTousuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.DaijiaDingdanTousuView;

/**
 * 代驾订单投诉 Dao 接口
 *
 * @author 
 */
public interface DaijiaDingdanTousuDao extends BaseMapper<DaijiaDingdanTousuEntity> {

   List<DaijiaDingdanTousuView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
