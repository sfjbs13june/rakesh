package com.rakesh.app.controller;

import com.rakesh.app.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(Calculator.class)
public class CalculatorIntegrationTest {
        @Autowired
        private MockMvc mockMvc;
        @Test
        public void testCalculatorIntegrationAdd() throws Exception
        {
            long a = 35L;
            long b = 5L;
           ResultActions responseEntity = mockMvc.perform(MockMvcRequestBuilders.get("/add").param("a",String.valueOf(a)).param("b",String.valueOf(b)));
            responseEntity.andExpect(status().isOk());
            String result =  responseEntity.andReturn().getResponse().getContentAsString();
            Assert.assertEquals("40",result);
        }
        @Test
        public void testCalculatorIntegrationSub() throws Exception
        {
            long a = 35L;
            long b = 5L;
            ResultActions responseEntity = mockMvc.perform(MockMvcRequestBuilders.post("/sub").param("a",String.valueOf(a)).param("b",String.valueOf(b)));
            responseEntity.andExpect(status().isOk());
            String result = responseEntity.andReturn().getResponse().getContentAsString();
            Assert.assertEquals("30",result);
        }
        @Test
        public void testCalulatorIntegrationMul() throws Exception
        {
            long a = 35L;
            long b= 5L;
            ResultActions responseEntity = mockMvc.perform(MockMvcRequestBuilders.put("/mul").param("a",String.valueOf(a)).param("b",String.valueOf(b)));
            responseEntity.andExpect(status().isOk());
            String result = responseEntity.andReturn().getResponse().getContentAsString();
            Assert.assertEquals("175",result);
        }
        @Test
        public void testCalculatorIntegrationDiv() throws  Exception
        {
            long a = 35L;
            long b = 5L;
            ResultActions responseEntity = mockMvc.perform(MockMvcRequestBuilders.delete("/div").param("a",String.valueOf(a)).param("b",String.valueOf(b)));
            responseEntity.andExpect(status().isOk());
            String result = responseEntity.andReturn().getResponse().getContentAsString();
            Assert.assertEquals("7",result);
        }




}
