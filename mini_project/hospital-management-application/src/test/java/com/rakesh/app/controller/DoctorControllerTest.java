package com.rakesh.app.controller;

import com.rakesh.app.model.Appointment;
import com.rakesh.app.model.Prescription;
import com.rakesh.app.repository.AppointmentRepository;
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
public class DoctorControllerTest {
    @InjectMocks
    private DoctorController doctorController;
    @Mock
    Appointment appointment;
    @Mock
    AppointmentRepository appointmentRepository;
    @BeforeEach
    void setUp()
    {
        appointment = Mockito.mock(Appointment.class);
        appointmentRepository=Mockito.mock(AppointmentRepository.class);
    }

    @Test
    public  void Test1()
    {
        List<Appointment> appointments = new ArrayList();
        Appointment appointment1 = new Appointment();
        appointment1.setAppointmentId("123");
        appointment1.setDoctorName("doc1");
        appointment1.setDate("14th feb 2023");
        appointment1.setPatientName("pat1");
        Prescription prescription = new Prescription("36","123","cough","abc","xyz");
        appointment1.setPrescription(prescription);
        appointments.add(appointment1);
        when(appointmentRepository.findByDoctorName(anyString())).thenReturn(appointments);
        List<Appointment> result=doctorController.getAppointments("abc");

        assertEquals(appointments.get(0).getAppointmentId(),result.get(0).getAppointmentId());
        assertEquals(appointments.get(0).getDoctorName(),result.get(0).getDoctorName());
        assertEquals(appointments.get(0).getDate(),result.get(0).getDate());
        assertEquals(appointments.get(0).getPatientName(),result.get(0).getPatientName());

    }

    @Test
    public  void Test2()
    {
        List<Appointment> appointments = new ArrayList<>();
        Prescription prescription1 = new Prescription("54","234","tb","rakesh","pavan");
        Appointment app1= new Appointment("234","pavan","rakesh","14th feb 2023",prescription1);
        appointments.add(app1);
        when(appointmentRepository.findByDoctorName(anyString())).thenReturn(appointments);
        List<Appointment> result = doctorController.getAppointments("rakesh");
        assertEquals(appointments.get(0).getAppointmentId(),result.get(0).getAppointmentId());
        assertEquals(appointments.get(0).getDoctorName(),result.get(0).getDoctorName());
        assertEquals(appointments.get(0).getDate(),result.get(0).getDate());
        assertEquals(appointments.get(0).getPatientName(),result.get(0).getPatientName());

    }

}
