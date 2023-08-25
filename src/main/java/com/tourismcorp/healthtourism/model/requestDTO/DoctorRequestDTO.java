package com.tourismcorp.healthtourism.model.requestDTO;

import com.tourismcorp.healthtourism.model.RoleDTO;
import com.tourismcorp.healthtourism.model.UserDTO;
import com.tourismcorp.healthtourism.util.BaseDTO;
import lombok.Data;

import java.util.Set;

@Data
public class DoctorRequestDTO extends UserDTO {

    private String field;

    private HospitalRequestDTO hospital;
}
