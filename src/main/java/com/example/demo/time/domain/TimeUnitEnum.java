package com.example.demo.time.domain;

import org.springframework.context.annotation.Bean;

import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

public enum TimeUnitEnum {

    MILLISECONDS,
    SECONDS,
    MINUTES,
    HOURS;

    @Bean
    public static Long fromHour(TimeUnit unit, LocalTime time){

        int hour = time.getHour();
        int minute = time.getMinute();
        int second = time.getSecond();
        int millisecond = time.getNano();
        switch (unit){
            case HOURS:
                return hour*1L;
            case MINUTES:
                return hour*(60L) + minute;
            case SECONDS:
                return second + hour*(60L*60L) + minute*60L;
            case MILLISECONDS:
                return (second*1000) + (hour*60L*60L*1000) + (minute*60L*1000) + (millisecond*1000000L);
            default:
                throw new UnsupportedOperationException();
        }
    }
}
