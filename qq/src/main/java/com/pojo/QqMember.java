package com.pojo;

/*
 *@Date: 15:08 2019/12/17
 *@Description: QQ帐号
 */

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class QqMember {
    /**
     * 主键id
     */
    private Integer id;
    /**
     * qq号
     */
    private String qqNumber;
    /**
     * 密码
     */
    private String password;
    /**
     * 头像
     */
    private String imgUrl;
    /**
     * 昵称
     */
    private String nickName;
    /**
     * 性别
     */
    private String sex;

    public static void main(String[] args) {
        List<QqMember> list = new ArrayList<QqMember>();

    }
}