package com.psfd.demo.web;


import com.psfd.demo.service.IReadersTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Mht
 * @since 2020-07-14
 */
@Controller
@RequestMapping("/readers_type")
public class ReadersTypeController {
    @Autowired
    IReadersTypeService iReaders_typeService;


}

