package com.mice.web;

import com.mice.common.Result;
import com.mice.domain.exception.BusinessException;
import com.mice.web.vo.request.TestVO;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: ChenHao
 * @Date: 2018/5/22 17:36
 */

@Controller
public class TestController {

    @RequestMapping("test")
    @ResponseBody public Result test(@Validated @RequestBody TestVO testVO){
        throw new BusinessException("22","s");
    }
}
