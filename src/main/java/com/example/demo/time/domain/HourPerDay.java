package com.example.demo.time.domain;

import lombok.Value;

@Value
public class HourPerDay {

    Hour hour;
    Minutes minutes;
    Seconds seconds;
    Integer horaDelDia;

    public static HourPerDay from(Hour hour, Minutes minutes, Seconds seconds, Integer horaDelDia) {
        return new HourPerDay(hour,minutes,seconds,horaDelDia);
    }
}
