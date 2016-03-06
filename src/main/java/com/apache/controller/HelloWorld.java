package com.apache.controller;

import java.net.SocketPermission;

/**
 * Created by wt on 2016/3/6.
 */
public class HelloWorld {
    public void setName(String name) {
        System.out.println("setName = "+name);
        this.name = name;
    }

    private String name;
    public void hello(){
        System.out.println("hello:"+ name);
    }
    public HelloWorld(){
        System.out.println("HelloWorld's Constructor");
    }

}
