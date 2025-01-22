package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.GongyingbumenDao;
import com.entity.GongyingbumenEntity;
import com.service.GongyingbumenService;
import com.entity.vo.GongyingbumenVO;
import com.entity.view.GongyingbumenView;

@Service("gongyingbumenService")
public class GongyingbumenServiceImpl extends ServiceImpl<GongyingbumenDao, GongyingbumenEntity> implements GongyingbumenService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GongyingbumenEntity> page = this.selectPage(
                new Query<GongyingbumenEntity>(params).getPage(),
                new EntityWrapper<GongyingbumenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GongyingbumenEntity> wrapper) {
		  Page<GongyingbumenView> page =new Query<GongyingbumenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GongyingbumenVO> selectListVO(Wrapper<GongyingbumenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GongyingbumenVO selectVO(Wrapper<GongyingbumenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GongyingbumenView> selectListView(Wrapper<GongyingbumenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GongyingbumenView selectView(Wrapper<GongyingbumenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
