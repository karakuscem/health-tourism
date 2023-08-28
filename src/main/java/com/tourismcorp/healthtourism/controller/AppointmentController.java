package com.tourismcorp.healthtourism.controller;

import com.tourismcorp.healthtourism.database.entities.AppointmentEntity;
import com.tourismcorp.healthtourism.database.repositories.AppointmentRepository;
import com.tourismcorp.healthtourism.database.specification.AppointmentSpecification;
import com.tourismcorp.healthtourism.mapper.AppointmentMapper;
import com.tourismcorp.healthtourism.model.AppointmentDTO;
import com.tourismcorp.healthtourism.model.requestDTO.AppointmentRequestDTO;
import com.tourismcorp.healthtourism.service.AppointmentService;
import com.tourismcorp.healthtourism.util.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("appointment")
public class AppointmentController extends BaseController<
        AppointmentEntity,
        AppointmentDTO,
        AppointmentRequestDTO,
        AppointmentMapper,
        AppointmentRepository,
        AppointmentSpecification,
        AppointmentService> {

    @Autowired
    AppointmentService appointmentService;

    @Override
    protected AppointmentService getService() {
        return this.appointmentService;
    }
}
