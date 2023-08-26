package com.tourismcorp.healthtourism.service;

import com.tourismcorp.healthtourism.database.entities.AppointmentEntity;
import com.tourismcorp.healthtourism.database.repositories.AppointmentRepository;
import com.tourismcorp.healthtourism.mapper.AppointmentMapper;
import com.tourismcorp.healthtourism.model.AppointmentDTO;
import com.tourismcorp.healthtourism.model.requestDTO.AppointmentRequestDTO;
import com.tourismcorp.healthtourism.util.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService extends BaseService<
        AppointmentEntity,
        AppointmentDTO,
        AppointmentRequestDTO,
        AppointmentMapper,
        AppointmentRepository> {

    @Autowired
    AppointmentMapper appointmentMapper;

    @Autowired
    AppointmentRepository appointmentRepository;


    @Override
    protected AppointmentMapper getMapper() {
        return this.appointmentMapper;
    }

    @Override
    protected AppointmentRepository getRepository() {
        return this.appointmentRepository;
    }
}
