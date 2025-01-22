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


import com.dao.CaiwubuDao;
import com.entity.CaiwubuEntity;
import com.service.CaiwubuService;
import com.entity.vo.CaiwubuVO;
import com.entity.view.CaiwubuView;

@Service("caiwubuService")
public class CaiwubuServiceImpl extends ServiceImpl<CaiwubuDao, CaiwubuEntity> implements CaiwubuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CaiwubuEntity> page = this.selectPage(
                new Query<CaiwubuEntity>(params).getPage(),
                new EntityWrapper<CaiwubuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CaiwubuEntity> wrapper) {
		  Page<CaiwubuView> page =new Query<CaiwubuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CaiwubuVO> selectListVO(Wrapper<CaiwubuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CaiwubuVO selectVO(Wrapper<CaiwubuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CaiwubuView> selectListView(Wrapper<CaiwubuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CaiwubuView selectView(Wrapper<CaiwubuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
