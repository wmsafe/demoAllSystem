package com.psfd.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.psfd.demo.entity.BookMessage;
import com.psfd.demo.mapper.BookMessageMapper;
import com.psfd.demo.service.IBookMessageService;
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
public class BookMessageServiceImpl extends ServiceImpl<BookMessageMapper, BookMessage> implements IBookMessageService {

}
