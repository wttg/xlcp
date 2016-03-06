package com.apache.controller;

import com.thoughtworks.selenium.DefaultSelenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

/**
 * Created by wt on 2016/3/6.
 */
public class main {
    public static void main(String[] args){


        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");
        //helloWorld.hello();

    }
}
