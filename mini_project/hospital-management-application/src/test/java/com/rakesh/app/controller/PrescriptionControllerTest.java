package com.rakesh.app.controller;

import com.rakesh.app.model.Prescription;
import com.rakesh.app.repository.PrescriptionRepository;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
@RunWith(MockitoJUnitRunner.class)
public class PrescriptionControllerTest {
    @InjectMocks
    private PrescriptionController prescriptionController;
    @Mock
    Prescription prescription;
    @Mock
    PrescriptionRepository prescriptionRepository;
    @BeforeEach
    void setUp()
    {
        prescription= Mockito.mock(Prescription.class);
        prescriptionRepository=Mockito.mock(PrescriptionRepository.class);

    }

    @Test
    public void Test1()
    {
        List test = new ArrayList();
        when(prescriptionRepository.findByPatientName(anyString())).thenReturn(test);
        List result=prescriptionController.getAllPrescriptions("abcd");
        assertEquals(test,result);
    }
    @Test
    public void Test2()
    {
        Prescription pre1 = new Prescription();
        when(prescriptionRepository.save(any(Prescription.class))).thenReturn(pre1);
        Prescription result = prescriptionController.savePrescription(prescription);
        assertEquals(pre1,result);
    }
}
