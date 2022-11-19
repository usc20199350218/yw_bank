package com.yw.shop.server.controller;/*
 * @PACKAGE_NAME com.yw.shop.server.controller
 * @author  guyue
 * @date  2022-11-18 - 15:03
 * @version  1.0
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guyue
 * @date 2022/11/18 15:03
 **/
@RestController
@RequestMapping
public class TestController {
    @GetMapping( "/admin" )
    public String te( ) {
        return "cg";
    }
}
