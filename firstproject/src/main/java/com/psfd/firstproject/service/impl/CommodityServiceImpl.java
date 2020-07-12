package com.psfd.firstproject.service.impl;

import com.psfd.firstproject.entity.Commodity;
import com.psfd.firstproject.mapper.CommodityMapper;
import com.psfd.firstproject.service.ICommodityService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Mht
 * @since 2020-07-12
 */
@Service
@Transactional
public class CommodityServiceImpl extends ServiceImpl<CommodityMapper, Commodity> implements ICommodityService {

}
