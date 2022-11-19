package com.yw.shop.server;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.auth0.jwt.interfaces.JWTVerifier;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ServerApplicationTests {
    @Test
    void contextLoads( ) {
    }


    @Test
    void creatToken( ) {
        try {
            //根据密码创建算法，secret是密钥，可以自定义
            Algorithm algorithm = Algorithm.HMAC256( "secret" );
            //创建token，Issuer是token的拥有人，可以自定义
            String token = JWT.create( )
                    .withIssuer( "admin" ) //将用户的账号信息存储到jwt中
                    .sign( algorithm );
            System.out.println( "token:" + token );
        } catch ( JWTCreationException exception ) {
            //Invalid Signing configuration / Couldn't convert Claims.
        }
    }

    @Test
    public void verifyToken( ) {
        String token =
//                "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJhY2NvdW50IjoiYWRtaW4ifQ.KwqnEL9JyY61_ygqgWCyqpW3l821CVP6BLPfHOWEooU"
//                "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJhZG1pbiJ9.c5whj4wxLXo1rrZsCYd4UGjX1ncsTCleqA9CWIrGMoM"
//                "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiIxMjM0IiwiZXhwIjoxNjY4Nzc4NTcxfQ.HXdrszxJ10xPL6ko5NwiQWVZOvz2m9abL1lgDL85OVU"
                "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiIxMjM0IiwiZXhwIjoxNjY4Nzc4NjQ0fQ.ux7tUKoRci5qkJ107fav-IGU8TuyGXtti9wik-XxPi";

        try {
            Algorithm algorithm = Algorithm.HMAC256( "secret" );
            JWTVerifier verifier = JWT.require( algorithm )
                    .build( ); //Reusable verifier instance
            DecodedJWT jwt = verifier.verify( token );
            System.out.println( "token验证成功" );
        } catch ( JWTVerificationException exception ) {
            //Invalid signature/claims
            exception.printStackTrace( );
        }
    }
}
