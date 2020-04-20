package com.example.demo.time.domain;


import lombok.Value;

@Value(staticConstructor = "of")
public class DayTime {

    Hour hour;
    Minutes minutes;
    Seconds seconds;
}
