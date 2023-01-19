package com.rakesh.app.controller;

import com.rakesh.app.Calculator;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calculator= new Calculator();
    @Test
    public void testrequestAdd()
    {
        long a = 35L;
        long b = 5L;
        long expectedResult = 40;
        long res =calculator.add(a,b);
        Assertions.assertEquals(expectedResult,res);
    }
    @Test
    public void testrequestSub()
    {
        long a = 35L;
        long b = 5L;
        long res = calculator.sub(a,b);
        Assert.assertEquals(30,res);
    }
    @Test
    public void testrequestMul()
    {
        long a=35L,b=5L;
        Assert.assertEquals(175,calculator.mul(a,b));
    }
    @Test
    public void testrequestDiv()
    {
        long a= 35L,b=5L;
        long res = calculator.div(a,b);
        Assert.assertEquals(7,res);
    }

}
