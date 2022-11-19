package com.yw.shop.pay.controller;/*
 * @PACKAGE_NAME co.yw.shop.pay.controller
 * @author  guyue
 * @date  2022-11-18 - 19:13
 * @version  1.0
 */

import com.yw.shop.pay.entity.Pay;
import com.yw.shop.product.entity.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guyue
 * @date 2022/11/18 19:13
 **/
@RestController
@RequestMapping( "api/pay" )
public class PayController {
    @GetMapping
    public String get( ) {
        Product product = new Product( );
        Pay pay = new Pay( );
        return "支付商品";
    }
}
