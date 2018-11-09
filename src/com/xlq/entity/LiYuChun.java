package com.xlq.entity;

/**
 * Created by c3tec on 2018/11/8.
 */
public class LiYuChun implements Person {

    @Override
    public String sing(String name) {
        System.out.println("sing");
        return "谢谢";
    }

    @Override
    public String dance(String name) {
        System.out.println("dance");
        return "飞吻";
    }
}
