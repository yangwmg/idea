package com.henu.controller;

import com.henu.service.HelloService;

/**
 * Created by Administrator on 2018/7/1.
 */
public class WebTest {

    public static void main(String[] args){

        HelloService helloService = new HelloService();

        String result = helloService.sayHelloService("zs");

        System.out.println(result);
    }
}
