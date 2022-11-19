package com.yw.shop.admin.controller;/*
 * @PACKAGE_NAME com.yw.shop.admin.controller
 * @author  guyue
 * @date  2022-11-18 - 20:20
 * @version  1.0
 */

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author guyue
 * @date 2022/11/18 20:20
 **/
@RestController
@RequestMapping( "api" )
public class LoginController {
    @RequestMapping( "login.do" )
    public String login( String username, String userPassword ) {
        if ( userPassword.equals( "123" ) ) {
            //根据密码创建算法，secret是密钥，可以自定义
            Algorithm algorithm = Algorithm.HMAC256( "secret" );
            //创建token，Issuer是token的拥有人，可以自定义
            String token = JWT.create( )
                    .withIssuer( username ) //将用户的账号信息存储到jwt中
                    .withExpiresAt(new Date(System.currentTimeMillis()+1000*30))//设置有效时间是30秒
                    .sign( algorithm );
            System.out.println( "token:" + token );
            return token;
        }
        return "登录失败";
    }
}
