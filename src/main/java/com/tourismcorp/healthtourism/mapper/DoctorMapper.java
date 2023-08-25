package com.tourismcorp.healthtourism.mapper;

import com.tourismcorp.healthtourism.database.entities.DoctorEntity;
import com.tourismcorp.healthtourism.model.DoctorDTO;
import com.tourismcorp.healthtourism.model.requestDTO.DoctorRequestDTO;
import com.tourismcorp.healthtourism.util.IBaseMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DoctorMapper implements IBaseMapper<DoctorEntity, DoctorDTO, DoctorRequestDTO> {
    @Override
    public DoctorDTO entityToDTO(DoctorEntity entity) {
        DoctorDTO doctorDTO = new DoctorDTO();
        doctorDTO.setUuid(entity.getUuid());
        doctorDTO.setCreationDate(entity.getCreationDate());
        doctorDTO.setUpdatedDate(entity.getUpdatedDate());
        doctorDTO.setId(entity.getId());
        doctorDTO.setFirstName(entity.getFirstName());
        doctorDTO.setLastName(entity.getLastName());
        doctorDTO.setField(entity.getField());
        //doctorDTO.setRoles(entity.getRoles());
        //doctorDTO.setHospital(entity.getHospital());

        return doctorDTO;
    }

    @Override
    public DoctorEntity dtoToEntity(DoctorDTO dto) {
        DoctorEntity doctorEntity = new DoctorEntity();
        doctorEntity.setUuid(dto.getUuid());
        doctorEntity.setCreationDate(dto.getCreationDate());
        doctorEntity.setUpdatedDate(dto.getUpdatedDate());
        doctorEntity.setId(dto.getId());
        doctorEntity.setFirstName(dto.getFirstName());
        doctorEntity.setLastName(dto.getLastName());
        doctorEntity.setField(dto.getField());
        //doctorEntity.setRoles(dto.getRoles());
        //doctorEntity.setHospital(dto.getHospital());

        return doctorEntity;
    }

    @Override
    public List<DoctorDTO> entityListToDTOList(List<DoctorEntity> entityList) {
        List<DoctorDTO> doctorDTOList = new ArrayList<>();
        for (DoctorEntity entity : entityList) {
            DoctorDTO dto = entityToDTO(entity);
            doctorDTOList.add(dto);
        }
        return doctorDTOList;
    }

    @Override
    public List<DoctorEntity> dtoListToEntityList(List<DoctorDTO> dtoList) {
        List<DoctorEntity> doctorEntityList = new ArrayList<>();
        for (DoctorDTO dto : dtoList) {
            DoctorEntity entity = dtoToEntity(dto);
            doctorEntityList.add(entity);
        }
        return doctorEntityList;
    }

    @Override
    public DoctorEntity requestDTOToEntity(DoctorRequestDTO requestDTO) {
        DoctorEntity doctorEntity = new DoctorEntity();
        doctorEntity.setUuid(requestDTO.getUuid());
        doctorEntity.setCreationDate(requestDTO.getCreationDate());
        doctorEntity.setUpdatedDate(requestDTO.getUpdatedDate());
        doctorEntity.setId(requestDTO.getId());
        doctorEntity.setFirstName(requestDTO.getFirstName());
        doctorEntity.setLastName(requestDTO.getLastName());
        doctorEntity.setField(requestDTO.getField());
        //doctorEntity.setRoles(requestDTO.getRoles());
        //doctorEntity.setHospital(requestDTO.getHospital());

        return doctorEntity;
    }

    @Override
    public List<DoctorEntity> requestDTOListToEntityList(List<DoctorRequestDTO> dtoList) {
        List<DoctorEntity> doctorEntityList = new ArrayList<>();
        for (DoctorRequestDTO dto : dtoList) {
            DoctorEntity entity = requestDTOToEntity(dto);
            doctorEntityList.add(entity);
        }
        return doctorEntityList;
    }

    @Override
    public DoctorEntity requestDTOToExistEntity(DoctorRequestDTO requestDTO, DoctorEntity entity) {
        entity.setUuid(requestDTO.getUuid());
        entity.setCreationDate(requestDTO.getCreationDate());
        entity.setUpdatedDate(requestDTO.getUpdatedDate());
        entity.setId(requestDTO.getId());
        entity.setFirstName(requestDTO.getFirstName());
        entity.setLastName(requestDTO.getLastName());
        entity.setField(requestDTO.getField());
        //entity.setRoles(requestDTO.getRoles());
        //entity.setHospital(requestDTO.getHospital());

        return entity;
    }
}
