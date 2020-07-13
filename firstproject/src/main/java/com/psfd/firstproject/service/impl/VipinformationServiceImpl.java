package com.psfd.firstproject.service.impl;

import com.psfd.firstproject.entity.Vipinformation;
import com.psfd.firstproject.mapper.VipinformationMapper;
import com.psfd.firstproject.service.IVipinformationService;
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
public class VipinformationServiceImpl extends ServiceImpl<VipinformationMapper, Vipinformation> implements IVipinformationService {

}
