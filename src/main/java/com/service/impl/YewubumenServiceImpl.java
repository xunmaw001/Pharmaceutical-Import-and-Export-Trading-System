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


import com.dao.YewubumenDao;
import com.entity.YewubumenEntity;
import com.service.YewubumenService;
import com.entity.vo.YewubumenVO;
import com.entity.view.YewubumenView;

@Service("yewubumenService")
public class YewubumenServiceImpl extends ServiceImpl<YewubumenDao, YewubumenEntity> implements YewubumenService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YewubumenEntity> page = this.selectPage(
                new Query<YewubumenEntity>(params).getPage(),
                new EntityWrapper<YewubumenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YewubumenEntity> wrapper) {
		  Page<YewubumenView> page =new Query<YewubumenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YewubumenVO> selectListVO(Wrapper<YewubumenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YewubumenVO selectVO(Wrapper<YewubumenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YewubumenView> selectListView(Wrapper<YewubumenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YewubumenView selectView(Wrapper<YewubumenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
