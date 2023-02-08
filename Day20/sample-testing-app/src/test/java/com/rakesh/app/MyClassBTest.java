package com.rakesh.app;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class MyClassBTest {
    @InjectMocks
    MyclassB myclassB;
    @Mock
    MyclassA myclassA;
    @Mock
    MyClassC myClassC;
    @BeforeEach
    void setUp()
    {
        myclassA= Mockito.mock(MyclassA.class);
        myClassC= Mockito.mock(MyClassC.class);

    }

    @Test
    public void TestMethod1()
    {
        String result = myclassB.getResult();
        assertEquals("my result",result);
    }

    @Test
    public void TestMethod2()
    {
        String result = myclassB.getMyString("hello");
        assertEquals("my resulthello",result);
    }

    @Test
    public void TestMethod3()
    {
        when(myClassC.getMyAge(anyInt())).thenReturn(35);
        int result = myClassC.getMyAge(25);
        assertEquals(35,result);
    }

    @Test
    public void TestMethod4()
    {
        myclassB.NoreturnData("my date");
        verify(myclassA,atLeast(0)).method6();
    }

}
