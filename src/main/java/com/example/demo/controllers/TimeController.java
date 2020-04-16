package com.example.demo.controllers;

import com.example.demo.time.domain.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;



@RestController
@RequestMapping

public class TimeController {

    @GetMapping("/info")
    public HourPerDay getInfoHour() {
        LocalDateTime now = LocalDateTime.now();
        Hour hour = Hour.of(now.getHour());
        Minutes minutes = Minutes.of(now.getMinute());
        Seconds seconds = Seconds.of(now.getSecond());


        Long hora = TimeUnitEnum.fromHour(TimeUnit.HOURS, now.toLocalTime());
        Long minuto = TimeUnitEnum.fromHour(TimeUnit.MINUTES, now.toLocalTime());
        Long segundo = TimeUnitEnum.fromHour(TimeUnit.SECONDS, now.toLocalTime());
        Long milisegundo = TimeUnitEnum.fromHour(TimeUnit.MILLISECONDS, now.toLocalTime());
            return HourPerDay.from(hour, minutes, seconds, minuto.intValue());
    }
}
