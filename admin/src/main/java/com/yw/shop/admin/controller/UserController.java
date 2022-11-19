package com.yw.shop.admin.controller;/*
 * @PACKAGE_NAME com.yw.shop.admin.controller
 * @author  guyue
 * @date  2022-11-18 - 14:32
 * @version  1.0
 */

import com.yw.shop.admin.entity.User;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

/**
 * @author guyue
 * @date 2022/11/18 14:32
 **/
@Log4j2
@RestController
@RequestMapping( "api/user" )
public class UserController {

    @PostMapping
    public String addUser( User user ) {
        log.warn( user );
        return "1";
    }

    @PutMapping
    public String updateUser( User user ) {
        log.warn( user );
        return "2";
    }

    @GetMapping( "{userId}" )
    public User getUser( @PathVariable Integer userId ) {
        return User.builder( ).userId( userId ).userName( "宇文" ).build( );
    }

    @DeleteMapping( "{userId}" )
    public String delUser( @PathVariable Integer userId ) {
        log.warn( userId );
        return "删除成功";
    }

    @GetMapping()
    public User info( String token ) {

//        User user = LoginController.userSessions.get( token );

//        if ( user != null ) {
//            return user;
//        } else {
//            throw new RuntimeException( "用户没有登录，请先登录" );
//        }
        return User.builder().build();
    }

}
