package com.tourismcorp.healthtourism.util;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class BaseUserDTO {
    private Long id;
    private UUID uuid;
    @JsonIgnore
    private Date creationDate;
    @JsonIgnore
    private Date updatedDate;
}
