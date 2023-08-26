package com.tourismcorp.healthtourism.service;

import com.tourismcorp.healthtourism.database.entities.PrescriptionEntity;
import com.tourismcorp.healthtourism.database.repositories.PrescriptionRepository;
import com.tourismcorp.healthtourism.mapper.PrescriptionMapper;
import com.tourismcorp.healthtourism.model.PrescriptionDTO;
import com.tourismcorp.healthtourism.model.requestDTO.PrescriptionRequestDTO;
import com.tourismcorp.healthtourism.util.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrescriptionService extends BaseService<
        PrescriptionEntity,
        PrescriptionDTO,
        PrescriptionRequestDTO,
        PrescriptionMapper,
        PrescriptionRepository> {

    @Autowired
    PrescriptionMapper prescriptionMapper;

    @Autowired
    PrescriptionRepository prescriptionRepository;

    @Override
    protected PrescriptionMapper getMapper() {
        return this.prescriptionMapper;
    }

    @Override
    protected PrescriptionRepository getRepository() {
        return this.prescriptionRepository;
    }
}
