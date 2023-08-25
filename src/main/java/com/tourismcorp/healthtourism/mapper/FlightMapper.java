package com.tourismcorp.healthtourism.mapper;

import com.tourismcorp.healthtourism.database.entities.FlightEntity;
import com.tourismcorp.healthtourism.model.FlightDTO;
import com.tourismcorp.healthtourism.model.requestDTO.FlightRequestDTO;
import com.tourismcorp.healthtourism.util.IBaseMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FlightMapper implements IBaseMapper<FlightEntity, FlightDTO, FlightRequestDTO> {
    @Override
    public FlightDTO entityToDTO(FlightEntity entity) {
        FlightDTO flightDTO = new FlightDTO();
        flightDTO.setUuid(entity.getUuid());
        flightDTO.setCreationDate(entity.getCreationDate());
        flightDTO.setUpdatedDate(entity.getUpdatedDate());
        flightDTO.setId(entity.getId());
        flightDTO.setFlightNumber(entity.getFlightNumber());
        flightDTO.setDeparture(entity.getDeparture());
        flightDTO.setArrival(entity.getArrival());
        flightDTO.setDepartureTime(entity.getDepartureTime());
        flightDTO.setDate(entity.getDate());
        flightDTO.setPrice(entity.getPrice());
        //flightDTO.setSeat(entity.getSeat());

        return flightDTO;
    }

    @Override
    public FlightEntity dtoToEntity(FlightDTO dto) {
        FlightEntity flightEntity = new FlightEntity();
        flightEntity.setUuid(dto.getUuid());
        flightEntity.setCreationDate(dto.getCreationDate());
        flightEntity.setUpdatedDate(dto.getUpdatedDate());
        flightEntity.setId(dto.getId());
        flightEntity.setFlightNumber(dto.getFlightNumber());
        flightEntity.setDeparture(dto.getDeparture());
        flightEntity.setArrival(dto.getArrival());
        flightEntity.setDepartureTime(dto.getDepartureTime());
        flightEntity.setDate(dto.getDate());
        flightEntity.setPrice(dto.getPrice());
        //flightEntity.setSeat(dto.getSeat());

        return flightEntity;
    }

    @Override
    public List<FlightDTO> entityListToDTOList(List<FlightEntity> entityList) {
        List<FlightDTO> flightDTOList = new ArrayList<>();
        for (FlightEntity entity : entityList) {
            FlightDTO dto = entityToDTO(entity);
            flightDTOList.add(dto);
        }
        return flightDTOList;
    }

    @Override
    public List<FlightEntity> dtoListToEntityList(List<FlightDTO> dtoList) {
        List<FlightEntity> flightEntityList = new ArrayList<>();
        for (FlightDTO dto : dtoList) {
            FlightEntity entity = dtoToEntity(dto);
            flightEntityList.add(entity);
        }
        return flightEntityList;
    }

    @Override
    public FlightEntity requestDTOToEntity(FlightRequestDTO requestDTO) {
        FlightEntity flightEntity = new FlightEntity();
        flightEntity.setFlightNumber(requestDTO.getFlightNumber());
        flightEntity.setDeparture(requestDTO.getDeparture());
        flightEntity.setArrival(requestDTO.getArrival());
        flightEntity.setDepartureTime(requestDTO.getDepartureTime());
        flightEntity.setDate(requestDTO.getDate());
        flightEntity.setPrice(requestDTO.getPrice());
        //flightEntity.setSeat(requestDTO.getSeat());

        return flightEntity;
    }

    @Override
    public List<FlightEntity> requestDTOListToEntityList(List<FlightRequestDTO> dtoList) {
        List<FlightEntity> flightEntityList = new ArrayList<>();
        for (FlightRequestDTO dto : dtoList) {
            FlightEntity entity = requestDTOToEntity(dto);
            flightEntityList.add(entity);
        }
        return flightEntityList;
    }

    @Override
    public FlightEntity requestDTOToExistEntity(FlightRequestDTO requestDTO, FlightEntity entity) {
        entity.setFlightNumber(requestDTO.getFlightNumber());
        entity.setDeparture(requestDTO.getDeparture());
        entity.setArrival(requestDTO.getArrival());
        entity.setDepartureTime(requestDTO.getDepartureTime());
        entity.setDate(requestDTO.getDate());
        entity.setPrice(requestDTO.getPrice());
        //entity.setSeat(requestDTO.getSeat());

        return entity;
    }


}
