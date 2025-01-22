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


import com.dao.GuoqiyaopinDao;
import com.entity.GuoqiyaopinEntity;
import com.service.GuoqiyaopinService;
import com.entity.vo.GuoqiyaopinVO;
import com.entity.view.GuoqiyaopinView;

@Service("guoqiyaopinService")
public class GuoqiyaopinServiceImpl extends ServiceImpl<GuoqiyaopinDao, GuoqiyaopinEntity> implements GuoqiyaopinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GuoqiyaopinEntity> page = this.selectPage(
                new Query<GuoqiyaopinEntity>(params).getPage(),
                new EntityWrapper<GuoqiyaopinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GuoqiyaopinEntity> wrapper) {
		  Page<GuoqiyaopinView> page =new Query<GuoqiyaopinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GuoqiyaopinVO> selectListVO(Wrapper<GuoqiyaopinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GuoqiyaopinVO selectVO(Wrapper<GuoqiyaopinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GuoqiyaopinView> selectListView(Wrapper<GuoqiyaopinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GuoqiyaopinView selectView(Wrapper<GuoqiyaopinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
