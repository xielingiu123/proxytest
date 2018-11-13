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

    //实现类,可以选择是否重写接口
    @Override
    public void eat() {
        System.out.println("实现类重写接口的eat方法");
    }
}
