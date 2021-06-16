package com.pod3.onlinebanking.service;

import java.util.List;

import com.pod3.onlinebanking.entity.Appointment;


public interface AppointmentService {

    Appointment createAppointment(Appointment appointment);

    List<Appointment> findAll();

    Appointment findAppointment(Long id);

    void confirmAppointment(Long id);
}