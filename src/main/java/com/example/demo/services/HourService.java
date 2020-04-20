package com.example.demo.services;


import com.example.demo.repositories.DayTimeRepository;
import com.example.demo.time.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class HourService {
    private final DayTimeRepository repository;

    @Autowired
    public HourService(@Qualifier("in-memory") DayTimeRepository repository) {
        this.repository = repository;
    }

    public HourCreated createHour(Hour hour, Minutes minutes, Seconds seconds) {
        return repository.createOne(hour, minutes, seconds);
    }

    public ArrayList<DayTime> findAll(){
     return  repository.findAll();
    }

}
