package com.tourismcorp.healthtourism.mapper;

import com.tourismcorp.healthtourism.database.entities.AppointmentEntity;
import com.tourismcorp.healthtourism.model.AppointmentDTO;
import com.tourismcorp.healthtourism.model.requestDTO.AppointmentRequestDTO;
import com.tourismcorp.healthtourism.util.IBaseMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AppointmentMapper implements IBaseMapper<AppointmentEntity, AppointmentDTO, AppointmentRequestDTO> {

        @Override
        public AppointmentDTO entityToDTO(AppointmentEntity entity) {
            AppointmentDTO appointmentDTO = new AppointmentDTO();
            appointmentDTO.setUuid(entity.getUuid());
            appointmentDTO.setCreationDate(entity.getCreationDate());
            appointmentDTO.setUpdatedDate(entity.getUpdatedDate());
            appointmentDTO.setId(entity.getId());
            //appointmentDTO.setDoctor(entity.getDoctor());
            //appointmentDTO.setPatient(entity.getPatient());
            //appointmentDTO.setDate(entity.getDate());

            return appointmentDTO;
        }

        @Override
        public AppointmentEntity dtoToEntity(AppointmentDTO dto) {
            AppointmentEntity appointmentEntity = new AppointmentEntity();
            appointmentEntity.setUuid(dto.getUuid());
            appointmentEntity.setCreationDate(dto.getCreationDate());
            appointmentEntity.setUpdatedDate(dto.getUpdatedDate());
            appointmentEntity.setId(dto.getId());
            //appointmentEntity.setDoctor(dto.getDoctor());
            //appointmentEntity.setPatient(dto.getPatient());
            //appointmentEntity.setDate(dto.getDate());

            return appointmentEntity;
        }

    @Override
    public List<AppointmentDTO> entityListToDTOList(List<AppointmentEntity> entityList) {
        List<AppointmentDTO> appointmentDTOList = new ArrayList<>();
        for (AppointmentEntity entity : entityList) {
            AppointmentDTO dto = entityToDTO(entity);
            appointmentDTOList.add(dto);
        }
        return appointmentDTOList;
    }

    @Override
    public List<AppointmentEntity> dtoListToEntityList(List<AppointmentDTO> dtoList) {
        List<AppointmentEntity> appointmentEntityList = new ArrayList<>();
        for (AppointmentDTO dto : dtoList) {
            AppointmentEntity entity = dtoToEntity(dto);
            appointmentEntityList.add(entity);
        }
        return appointmentEntityList;
    }

    @Override
    public AppointmentEntity requestDTOToEntity(AppointmentRequestDTO requestDTO) {
        AppointmentEntity appointmentEntity = new AppointmentEntity();
        appointmentEntity.setUuid(requestDTO.getUuid());
        appointmentEntity.setCreationDate(requestDTO.getCreationDate());
        appointmentEntity.setUpdatedDate(requestDTO.getUpdatedDate());
        appointmentEntity.setId(requestDTO.getId());
        //appointmentEntity.setDoctor(requestDTO.getDoctor());
        //appointmentEntity.setPatient(requestDTO.getPatient());
        //appointmentEntity.setDate(requestDTO.getDate());

        return appointmentEntity;
    }

    @Override
    public List<AppointmentEntity> requestDTOListToEntityList(List<AppointmentRequestDTO> dtoList) {
        List<AppointmentEntity> appointmentEntityList = new ArrayList<>();
        for (AppointmentRequestDTO dto : dtoList) {
            AppointmentEntity entity = requestDTOToEntity(dto);
            appointmentEntityList.add(entity);
        }
        return appointmentEntityList;
    }

    @Override
    public AppointmentEntity requestDTOToExistEntity(AppointmentRequestDTO requestDTO, AppointmentEntity entity) {
        entity.setUuid(requestDTO.getUuid());
        entity.setCreationDate(requestDTO.getCreationDate());
        entity.setUpdatedDate(requestDTO.getUpdatedDate());
        entity.setId(requestDTO.getId());
        //entity.setDoctor(requestDTO.getDoctor());
        //entity.setPatient(requestDTO.getPatient());
        //entity.setDate(requestDTO.getDate());

        return entity;
    }


}
