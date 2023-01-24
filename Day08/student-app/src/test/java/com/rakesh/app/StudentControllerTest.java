package com.rakesh.app;

import com.rakesh.app.controller.StudentController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

public class StudentControllerTest {
    StudentController studentController = new StudentController();
    @Test
    public void testList()
    {
        String listSize = String.valueOf(studentController.getStudent().size());
        Assertions.assertEquals("3",listSize);
    }
    @Test
    public void testMap()
    {
        String mapSize = String.valueOf(studentController.mapStudent().size());
        Assertions.assertEquals("3",mapSize);
    }


}
