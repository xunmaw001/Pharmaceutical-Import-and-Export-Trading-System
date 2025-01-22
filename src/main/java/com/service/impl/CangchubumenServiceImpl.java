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


import com.dao.CangchubumenDao;
import com.entity.CangchubumenEntity;
import com.service.CangchubumenService;
import com.entity.vo.CangchubumenVO;
import com.entity.view.CangchubumenView;

@Service("cangchubumenService")
public class CangchubumenServiceImpl extends ServiceImpl<CangchubumenDao, CangchubumenEntity> implements CangchubumenService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CangchubumenEntity> page = this.selectPage(
                new Query<CangchubumenEntity>(params).getPage(),
                new EntityWrapper<CangchubumenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CangchubumenEntity> wrapper) {
		  Page<CangchubumenView> page =new Query<CangchubumenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CangchubumenVO> selectListVO(Wrapper<CangchubumenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CangchubumenVO selectVO(Wrapper<CangchubumenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CangchubumenView> selectListView(Wrapper<CangchubumenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CangchubumenView selectView(Wrapper<CangchubumenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
