package com.tourismcorp.healthtourism.model;

import com.tourismcorp.healthtourism.util.BaseDTO;
import lombok.Data;

import java.util.Set;

@Data
public class UserDTO extends BaseDTO {

    private String username;

    private String password;

    private String email;

    private String firstName;

    private String lastName;

    private Set<RoleDTO> roles;
}
