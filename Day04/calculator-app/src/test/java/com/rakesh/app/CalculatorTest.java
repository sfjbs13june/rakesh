package com.rakesh.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calculator=new Calculator();
    @Test
    public void testrequestAdd() {
        double a = 60.0;
        double b = 30.0;
        double expectedResult = 90.0;
        double res = calculator.add(a,b);
        Assertions.assertEquals(expectedResult,res,0.00);
    }
    @Test
    public void testrequestSub() {
        double a = 60.0;
        double b = 30.0;
        double expectedResult = 30.0;
        double res = calculator.sub(a,b);
        Assertions.assertEquals(expectedResult,res,0.00);
    }

    @Test
    public void testrequestMul()
    {
        Calculator calculator = new Calculator();
        double a = 60.0;
        double b = 30.0;
        double expectedResult = 1800.0;
        double res = calculator.mul(a,b);
        Assertions.assertEquals(expectedResult,res,0.00);
    }

    @Test
    public void testrequestDiv() {
        Calculator calculator = new Calculator();
        double a = 60.0;
        double b = 30.0;
        double expectedResult = 2.0;
        double res = calculator.div(a,b);
        Assertions.assertEquals(expectedResult,res,0.00);
    }
}
