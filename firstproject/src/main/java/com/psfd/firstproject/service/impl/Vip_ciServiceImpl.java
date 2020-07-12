package com.psfd.firstproject.service.impl;

import com.psfd.firstproject.entity.Vip_ci;
import com.psfd.firstproject.mapper.Vip_ciMapper;
import com.psfd.firstproject.service.IVip_ciService;
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
public class Vip_ciServiceImpl extends ServiceImpl<Vip_ciMapper, Vip_ci> implements IVip_ciService {

}
