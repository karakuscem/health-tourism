package com.tourismcorp.healthtourism.model.requestDTO;

import com.tourismcorp.healthtourism.model.DateDTO;
import com.tourismcorp.healthtourism.model.DoctorDTO;
import com.tourismcorp.healthtourism.model.UserDTO;
import com.tourismcorp.healthtourism.util.BaseDTO;
import lombok.Data;

@Data

public class AppointmentRequestDTO extends BaseDTO {
    private DoctorDTO doctor;
    private UserDTO patient;
    private DateDTO date;

}
