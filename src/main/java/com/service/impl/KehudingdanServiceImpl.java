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


import com.dao.KehudingdanDao;
import com.entity.KehudingdanEntity;
import com.service.KehudingdanService;
import com.entity.vo.KehudingdanVO;
import com.entity.view.KehudingdanView;

@Service("kehudingdanService")
public class KehudingdanServiceImpl extends ServiceImpl<KehudingdanDao, KehudingdanEntity> implements KehudingdanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KehudingdanEntity> page = this.selectPage(
                new Query<KehudingdanEntity>(params).getPage(),
                new EntityWrapper<KehudingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KehudingdanEntity> wrapper) {
		  Page<KehudingdanView> page =new Query<KehudingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KehudingdanVO> selectListVO(Wrapper<KehudingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KehudingdanVO selectVO(Wrapper<KehudingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KehudingdanView> selectListView(Wrapper<KehudingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KehudingdanView selectView(Wrapper<KehudingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
