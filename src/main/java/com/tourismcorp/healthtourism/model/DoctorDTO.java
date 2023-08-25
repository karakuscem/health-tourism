package com.tourismcorp.healthtourism.model;

import lombok.Data;

import java.util.Set;

@Data
public class DoctorDTO extends UserDTO {

    private String field;

    private HospitalDTO hospital;
}
