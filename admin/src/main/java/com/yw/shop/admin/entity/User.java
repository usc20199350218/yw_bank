package com.yw.shop.admin.entity;/*
 * @PACKAGE_NAME com.yw.shop.admin.entity
 * @author  guyue
 * @date  2022-11-18 - 14:25
 * @version  1.0
 */

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author guyue
 * @date 2022/11/18 14:25
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    private Integer userId;
    private String userName;
    private String userPassword;
}
