package com.rakesh.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;
import static org.junit.Assert.assertEquals;

public class HelloControllerTest {
    HelloController helloController= new HelloController();
    @Test
    public void testSayHello(){
        String expectedResult= "Hello from App";
        String result=helloController.SayHello();
        Assertions.assertEquals(expectedResult,result);
    }
    @Test
    public void testrequestHello() {
        String expectedResult = "Hello from request mapping";
        String result = helloController.requestHello();
        Assertions.assertEquals(expectedResult, result);
    }
}
