package com.tourismcorp.healthtourism.model;

import com.tourismcorp.healthtourism.util.BaseDTO;
import lombok.Data;

@Data

public class AppointmentDTO extends BaseDTO {
    private DoctorDTO doctor;
    private UserDTO patient;
    private DateDTO date;

}
