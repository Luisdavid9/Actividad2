package com.example.demo.repositories;

import com.example.demo.time.domain.*;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;


@Repository
public interface DayTimeRepository {
    HourCreated createOne(Hour hour, Minutes minutes, Seconds seconds);

    ArrayList findAll();

}
