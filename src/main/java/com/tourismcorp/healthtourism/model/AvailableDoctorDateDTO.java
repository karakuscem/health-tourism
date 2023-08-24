package com.tourismcorp.healthtourism.model;

import com.tourismcorp.healthtourism.util.BaseDTO;
import lombok.Data;

import java.util.List;

@Data
public class AvailableDoctorDateDTO extends BaseDTO {

    private List<DoctorDTO> doctor;

    private List<DateDTO> date;

}
