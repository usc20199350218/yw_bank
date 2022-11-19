package com.yw.shop.product.controller;/*
 * @PACKAGE_NAME com.yw.shop.product.controller
 * @author  guyue
 * @date  2022-11-18 - 19:52
 * @version  1.0
 */

import com.yw.shop.pay.entity.Pay;
import com.yw.shop.product.entity.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guyue
 * @date 2022/11/18 19:52
 **/
@RestController
@RequestMapping( "api/product" )
public class ProductController {
    @GetMapping
    public String get( ) {
        Pay pay = new Pay( );
        Product product = new Product( );
        return "payController";
    }
}
