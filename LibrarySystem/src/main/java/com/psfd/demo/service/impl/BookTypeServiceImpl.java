package com.psfd.demo.service.impl;

import com.psfd.demo.entity.BookType;
import com.psfd.demo.mapper.BookTypeMapper;
import com.psfd.demo.service.IBookTypeService;
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
public class BookTypeServiceImpl extends ServiceImpl<BookTypeMapper, BookType> implements IBookTypeService {

}
