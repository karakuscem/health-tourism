package com.tourismcorp.healthtourism.mapper;

import com.tourismcorp.healthtourism.database.entities.AvailableRoomDateEntity;
import com.tourismcorp.healthtourism.model.AvailableRoomDateDTO;
import com.tourismcorp.healthtourism.model.requestDTO.AvailableRoomDateRequestDTO;
import com.tourismcorp.healthtourism.util.IBaseMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AvailableRoomDateMapper implements IBaseMapper<AvailableRoomDateEntity, AvailableRoomDateDTO,
        AvailableRoomDateRequestDTO> {
    @Override
    public AvailableRoomDateDTO entityToDTO(AvailableRoomDateEntity entity) {
        AvailableRoomDateDTO availableRoomDateDTO = new AvailableRoomDateDTO();
        availableRoomDateDTO.setUuid(entity.getUuid());
        availableRoomDateDTO.setCreationDate(entity.getCreationDate());
        availableRoomDateDTO.setUpdatedDate(entity.getUpdatedDate());
        availableRoomDateDTO.setId(entity.getId());
        //availableRoomDateDTO.setRoom(entity.getRoom());
        //availableRoomDateDTO.setDate(entity.getDate());

        return availableRoomDateDTO;
    }

    @Override
    public AvailableRoomDateEntity dtoToEntity(AvailableRoomDateDTO dto) {
        AvailableRoomDateEntity availableRoomDateEntity = new AvailableRoomDateEntity();
        availableRoomDateEntity.setUuid(dto.getUuid());
        availableRoomDateEntity.setCreationDate(dto.getCreationDate());
        availableRoomDateEntity.setUpdatedDate(dto.getUpdatedDate());
        availableRoomDateEntity.setId(dto.getId());
        //availableRoomDateEntity.setRoom(dto.getRoom());
        //availableRoomDateEntity.setDate(dto.getDate());

        return availableRoomDateEntity;
    }

    @Override
    public List<AvailableRoomDateDTO> entityListToDTOList(List<AvailableRoomDateEntity> entityList) {
        List<AvailableRoomDateDTO> availableRoomDateDTOList = new ArrayList<>();
        for (AvailableRoomDateEntity entity : entityList) {
            AvailableRoomDateDTO dto = entityToDTO(entity);
            availableRoomDateDTOList.add(dto);
        }
        return availableRoomDateDTOList;
    }

    @Override
    public List<AvailableRoomDateEntity> dtoListToEntityList(List<AvailableRoomDateDTO> dtoList) {
        List<AvailableRoomDateEntity> availableRoomDateEntityList = new ArrayList<>();
        for (AvailableRoomDateDTO dto : dtoList) {
            AvailableRoomDateEntity entity = dtoToEntity(dto);
            availableRoomDateEntityList.add(entity);
        }
        return availableRoomDateEntityList;
    }

    @Override
    public AvailableRoomDateEntity requestDTOToEntity(AvailableRoomDateRequestDTO requestDTO) {
        AvailableRoomDateEntity availableRoomDateEntity = new AvailableRoomDateEntity();
        availableRoomDateEntity.setUuid(requestDTO.getUuid());
        availableRoomDateEntity.setCreationDate(requestDTO.getCreationDate());
        availableRoomDateEntity.setUpdatedDate(requestDTO.getUpdatedDate());
        availableRoomDateEntity.setId(requestDTO.getId());
        //availableRoomDateEntity.setRoom(requestDTO.getRoom());
        //availableRoomDateEntity.setDate(requestDTO.getDate());

        return availableRoomDateEntity;
    }

    @Override
    public List<AvailableRoomDateEntity> requestDTOListToEntityList(List<AvailableRoomDateRequestDTO> dtoList) {
        List<AvailableRoomDateEntity> availableRoomDateEntityList = new ArrayList<>();
        for (AvailableRoomDateRequestDTO dto : dtoList) {
            AvailableRoomDateEntity entity = requestDTOToEntity(dto);
            availableRoomDateEntityList.add(entity);
        }
        return availableRoomDateEntityList;
    }

    @Override
    public AvailableRoomDateEntity requestDTOToExistEntity(AvailableRoomDateRequestDTO requestDTO, AvailableRoomDateEntity entity) {
        entity.setUuid(requestDTO.getUuid());
        entity.setCreationDate(requestDTO.getCreationDate());
        entity.setUpdatedDate(requestDTO.getUpdatedDate());
        entity.setId(requestDTO.getId());
        //entity.setRoom(requestDTO.getRoom());
        //entity.setDate(requestDTO.getDate());

        return entity;
    }
}
