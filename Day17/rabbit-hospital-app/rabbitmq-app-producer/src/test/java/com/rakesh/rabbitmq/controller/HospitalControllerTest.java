package com.rakesh.rabbitmq.controller;

import com.rakesh.rabbitmq.model.Hospital;
import com.rakesh.rabbitmq.model.Patient;
import com.rakesh.rabbitmq.service.RabbitMQSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.context.ActiveProfiles;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
@ActiveProfiles(value = "test")
public class HospitalControllerTest {
  @InjectMocks
  HospitalController hospitalController;

  @Mock
  RabbitMQSender rabbitMQSender;

  @Test
  public void producerTest() {

    doNothing().when(rabbitMQSender).sendHospital(any(Hospital.class));
    Hospital hospital = new Hospital();
    Hospital result= hospitalController.postHospital(hospital);

  }
  @Test
  public void producer1Test() {

    doNothing().when(rabbitMQSender).sendPatient(any(Patient.class));
    Patient patient = new Patient();
    Patient result= hospitalController.postPatient(patient);

  }
}