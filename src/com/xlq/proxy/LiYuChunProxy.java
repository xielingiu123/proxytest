package com.xlq.proxy;

import com.xlq.entity.LiYuChun;
import com.xlq.entity.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 *
 */
public class LiYuChunProxy {
    private Person chunchun = new LiYuChun();

    public Person createProxy(){

        return (Person) Proxy.newProxyInstance(
                LiYuChunProxy.class.getClassLoader(),
                chunchun.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                       String methodName = method.getName();

                       if(methodName.equals("sing")){
                           System.out.println("一万刀");
                           return method.invoke(chunchun,args);
                       }else if (methodName.equals("dance")){
                           System.out.println("两万刀");
                           return method.invoke(chunchun,args);
                       }else{

                           System.out.println("!");
                       }

                        return null;
                    }
                }
        );
    }
}