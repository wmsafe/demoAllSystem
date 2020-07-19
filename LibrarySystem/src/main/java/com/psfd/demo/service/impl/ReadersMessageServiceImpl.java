package com.psfd.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.psfd.demo.entity.ReadersMessage;
import com.psfd.demo.mapper.ReadersMessageMapper;
import com.psfd.demo.service.IReadersMessageService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Mht
 * @since 2020-07-14
 */
@Service
public class ReadersMessageServiceImpl extends ServiceImpl<ReadersMessageMapper, ReadersMessage> implements IReadersMessageService {

}
