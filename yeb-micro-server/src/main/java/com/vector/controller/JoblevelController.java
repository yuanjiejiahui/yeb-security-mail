package com.vector.controller;


import com.vector.service.IJoblevelService;
import com.vector.vo.RespVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author YuanJie
 * @since 2022-09-07
 */
@RestController
@RequestMapping("/system/basic/joblevel")
public class JoblevelController {
    @Resource
    private IJoblevelService joblevelServicel;

    /**
     * 获取职称
     * @return
     */
    @GetMapping("/")
    public RespVO getAllJoblevels(){
        return joblevelServicel.getAllJoblevels();
    }


}
