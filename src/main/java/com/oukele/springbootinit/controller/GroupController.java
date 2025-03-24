package com.oukele.springbootinit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author oukele
 * @since 2025-03-24
 */
@Controller
@RequestMapping("/group")
public class GroupController {

    @GetMapping("list")
    public List<?> getList() {
        return null;
    }

}
