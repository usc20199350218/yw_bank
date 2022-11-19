package com.yw.shop.server;/*
 * @PACKAGE_NAME com.yw.shop.server
 * @author  guyue
 * @date  2022-11-19 - 8:32
 * @version  1.0
 */

/**
 * @author guyue
 * @date 2022/11/19 08:32
 **/
public class TryC {
    public static int t( ) {
        try {
            System.out.println( 11 );
            int i = 1;
            if ( i < 5 ) {
                return 1;
            }
            System.out.println( 12 );
        } catch ( Exception e ) {
            System.out.println( 21 );
        } finally {
            System.out.println( 31 );
            int x = 1;
            if ( x < 5 ) {
//                return 3;
            }
            System.out.println( 32 );
        }
        return 0;
    }

    public static void main( String[] args ) {
        int t = t( );
        System.out.println( t );
    }
}
