package com.tourismcorp.healthtourism.mapper;

import com.tourismcorp.healthtourism.database.entities.AvailableDoctorDateEntity;
import com.tourismcorp.healthtourism.model.AvailableDoctorDateDTO;
import com.tourismcorp.healthtourism.model.requestDTO.AvailableDoctorDateRequestDTO;
import com.tourismcorp.healthtourism.util.IBaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AvailableDoctorDateMapper implements IBaseMapper<AvailableDoctorDateEntity,
        AvailableDoctorDateDTO, AvailableDoctorDateRequestDTO> {

    private final DoctorMapper doctorMapper;
    private final DateMapper dateMapper;

    @Autowired
    protected AvailableDoctorDateMapper(DoctorMapper doctorMapper, DateMapper dateMapper) {
        this.doctorMapper = doctorMapper;
        this.dateMapper = dateMapper;
    }
    @Override
    public AvailableDoctorDateDTO entityToDTO(AvailableDoctorDateEntity entity) {
        AvailableDoctorDateDTO availableDoctorDateDTO = new AvailableDoctorDateDTO();
        availableDoctorDateDTO.setUuid(entity.getUuid());
        availableDoctorDateDTO.setCreationDate(entity.getCreationDate());
        availableDoctorDateDTO.setUpdatedDate(entity.getUpdatedDate());
        availableDoctorDateDTO.setId(entity.getId());
        availableDoctorDateDTO.setDoctor(doctorMapper.entityListToDTOList(entity.getDoctor()));
        availableDoctorDateDTO.setDate(dateMapper.entityListToDTOList(entity.getDate()));

        return availableDoctorDateDTO;
    }

    @Override
    public AvailableDoctorDateEntity dtoToEntity(AvailableDoctorDateDTO dto) {
        AvailableDoctorDateEntity availableDoctorDateEntity = new AvailableDoctorDateEntity();
        availableDoctorDateEntity.setUuid(dto.getUuid());
        availableDoctorDateEntity.setCreationDate(dto.getCreationDate());
        availableDoctorDateEntity.setUpdatedDate(dto.getUpdatedDate());
        availableDoctorDateEntity.setId(dto.getId());
        availableDoctorDateEntity.setDoctor(doctorMapper.dtoListToEntityList(dto.getDoctor()));
        availableDoctorDateEntity.setDate(dateMapper.dtoListToEntityList(dto.getDate()));

        return availableDoctorDateEntity;
    }

    @Override
    public List<AvailableDoctorDateDTO> entityListToDTOList(List<AvailableDoctorDateEntity> entityList) {
        List<AvailableDoctorDateDTO> availableDoctorDateDTOList = new ArrayList<>();
        for (AvailableDoctorDateEntity entity : entityList) {
            AvailableDoctorDateDTO dto = entityToDTO(entity);
            availableDoctorDateDTOList.add(dto);
        }
        return availableDoctorDateDTOList;
    }

    @Override
    public List<AvailableDoctorDateEntity> dtoListToEntityList(List<AvailableDoctorDateDTO> dtoList) {
        List<AvailableDoctorDateEntity> availableDoctorDateEntityList = new ArrayList<>();
        for (AvailableDoctorDateDTO dto : dtoList) {
            AvailableDoctorDateEntity entity = dtoToEntity(dto);
            availableDoctorDateEntityList.add(entity);
        }
        return availableDoctorDateEntityList;
    }

    @Override
    public AvailableDoctorDateEntity requestDTOToEntity(AvailableDoctorDateRequestDTO requestDTO) {
        AvailableDoctorDateEntity availableDoctorDateEntity = new AvailableDoctorDateEntity();
        availableDoctorDateEntity.setUuid(requestDTO.getUuid());
        availableDoctorDateEntity.setCreationDate(requestDTO.getCreationDate());
        availableDoctorDateEntity.setUpdatedDate(requestDTO.getUpdatedDate());
        availableDoctorDateEntity.setId(requestDTO.getId());
        availableDoctorDateEntity.setDoctor(doctorMapper.requestDTOListToEntityList(requestDTO.getDoctor()));
        availableDoctorDateEntity.setDate(dateMapper.requestDTOListToEntityList(requestDTO.getDate()));

        return availableDoctorDateEntity;
    }

    @Override
    public List<AvailableDoctorDateEntity> requestDTOListToEntityList(List<AvailableDoctorDateRequestDTO> dtoList) {
        List<AvailableDoctorDateEntity> availableDoctorDateEntityList = new ArrayList<>();
        for (AvailableDoctorDateRequestDTO dto : dtoList) {
            AvailableDoctorDateEntity entity = requestDTOToEntity(dto);
            availableDoctorDateEntityList.add(entity);
        }
        return availableDoctorDateEntityList;
    }

    @Override
    public AvailableDoctorDateEntity requestDTOToExistEntity(AvailableDoctorDateRequestDTO requestDTO,
                                                             AvailableDoctorDateEntity entity) {
        if (requestDTO.getDoctor() != null)
            entity.setDoctor(doctorMapper.requestDTOListToEntityList(requestDTO.getDoctor()));
        if (requestDTO.getDate() != null)
          entity.setDate(dateMapper.requestDTOListToEntityList(requestDTO.getDate()));

        return entity;
    }
}
