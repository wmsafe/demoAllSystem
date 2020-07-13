package com.psfd.demo.service.impl;

import com.psfd.demo.entity.BookMessage;
import com.psfd.demo.mapper.BookMessageMapper;
import com.psfd.demo.service.IBookMessageService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Mht
 * @since 2020-07-11
 */
@Service
public class BookMessageServiceImpl extends ServiceImpl<BookMessageMapper, BookMessage> implements IBookMessageService {

}
