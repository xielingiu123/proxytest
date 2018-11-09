package com.xlq.test;

import com.xlq.entity.Person;
import com.xlq.proxy.LiYuChunProxy;

/**
 * Created by c3tec on 2018/11/8.
 */
public class Demo {
        public static void main(String[] args){
            LiYuChunProxy chunchunProxy =new LiYuChunProxy();
            Person person = chunchunProxy.createProxy();

            String result =  person.dance("江南皮革厂");
            System.out.println(result);
            result =person.sing("伦巴");
            System.out.println(result);
        }
}
