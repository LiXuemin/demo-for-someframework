package com.lixuemin.mock.entity;

import lombok.Data;


/**
 * @description 不同规则属性，lombok生成的getter/setter方法
 * @author: lixuemin
 **/
@Data
public class UserDTO {

    private String uName;

    private boolean active;

    private Boolean closed;

    private Boolean isDeleted;

    private boolean isActive2;
}
