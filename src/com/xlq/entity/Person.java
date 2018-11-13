package com.xlq.entity;

/**
 * Created by c3tec on 2018/11/8.
 */
public interface Person {
     String sing(String name);
     String dance(String name);

     /**
      * default:使接口有方法体，自己默认的实现
      *   default集成了抽象接口的优点。
      *
      */
     default void eat(){
          System.out.println("default eat interface...");
     }
}
