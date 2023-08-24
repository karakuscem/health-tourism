package com.tourismcorp.healthtourism.model.requestDTO;

import com.tourismcorp.healthtourism.util.BaseDTO;
import lombok.Data;

import java.util.Date;

@Data
public class DateRequestDTO extends BaseDTO {

    private Date date;
}
