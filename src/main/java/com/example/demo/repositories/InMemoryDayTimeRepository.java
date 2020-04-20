package com.example.demo.repositories;

import com.example.demo.time.domain.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Repository
@Qualifier("in-memory")
public class InMemoryDayTimeRepository implements DayTimeRepository {

    private final  ArrayList array = new ArrayList();

    @Override
    public HourCreated createOne(Hour hour, Minutes minutes, Seconds seconds    ) {

        HourCreated hourCreated = HourCreated.of(hour, minutes, seconds);
        array.add( hourCreated);
        return hourCreated;
    }

    @Override
    public ArrayList findAll() {
        return array;
    }


}
