package com.rakesh.app;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class MyClassCTest {
    @InjectMocks
    MyClassC myClassC;
    @Mock
    MyclassB myclassB;
    @Mock
    MyclassA myclassA;
    @BeforeEach
    void setUp()
    {
        myclassA= Mockito.mock(MyclassA.class);
        myclassB=Mockito.mock(MyclassB.class);
    }
    @Test
    public void TestMethod1()
    {
        int result = myClassC.getMyAge(25);
        assertEquals(25,result);
    }
}
