package com.example.demo.controllers;

import com.example.demo.services.HourService;
import com.example.demo.time.domain.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;



@RestController
@RequestMapping("/api/v1/times")
@RequiredArgsConstructor
public class DayTimeController {

    /*@GetMapping
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
    }*/

    private final HourService service;

    @PostMapping
    public  HourCreated createHour(@RequestBody DayTime hourBody) {
        return service.createHour(hourBody.getHour(), hourBody.getMinutes(), hourBody.getSeconds());

    }

    @GetMapping
    public ArrayList<DayTime> findAll() {
        return service.findAll();
    }
}
