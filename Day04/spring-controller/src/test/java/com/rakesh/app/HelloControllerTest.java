package com.rakesh.app;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class HelloControllerTest {
    HelloController helloController=new HelloController();
    @Test
    public void testSayHello(){
        String expectedResult="hello from App";
        String result=helloController.SayHello();
        Assert.assertEquals(expectedResult,result);
    }
    @Test
    public void testrequestHello(){
        String expectedResult="hello from request mapping";
        String result=helloController.requestHello();
        Assert.assertEquals(expectedResult,result);
    }
    @Test
    public void testrequestWelcome()
    {
        String name="world";
        String expectedResult="welcome to "+name;
        String result =helloController.hello(name);
        Assert.assertEquals(expectedResult,result);
    }
    @Test
    public void testrequestSendMessage()
    {
        String message="hello";
        String expectedResult="send message "+message;
        String result =helloController.sendMessage(message);
        Assert.assertEquals(expectedResult,result);
    }






}