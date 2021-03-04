package com.futureappsmobile.data;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.TimeZone;

@Getter
@Setter
@AllArgsConstructor
public class Model {

    private String date;
    private String hour;
    private TimeZone time_zone;

}
