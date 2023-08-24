package com.tourismcorp.healthtourism.model.requestDTO;

import com.tourismcorp.healthtourism.model.DateDTO;
import com.tourismcorp.healthtourism.model.DoctorDTO;
import com.tourismcorp.healthtourism.util.BaseDTO;
import lombok.Data;

import java.util.List;

@Data
public class AvailableDoctorDateRequestDTO extends BaseDTO {

    private List<DoctorDTO> doctor;

    private List<DateDTO> date;

}
