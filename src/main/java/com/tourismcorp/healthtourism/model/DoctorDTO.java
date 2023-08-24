package com.tourismcorp.healthtourism.model;

import com.tourismcorp.healthtourism.util.BaseUserDTO;
import lombok.Data;

import java.util.Set;

@Data
public class DoctorDTO extends BaseUserDTO {

    private String username;

    private String password;

    private String email;

    private String firstName;

    private String lastName;

    private String field;

    private Set<RoleDTO> roles;

    private HospitalDTO hospital;
}
