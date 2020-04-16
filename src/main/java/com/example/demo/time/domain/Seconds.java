package com.example.demo.time.domain;


import com.example.demo.common.Preconditions;
import lombok.Value;

@Value(staticConstructor = "of")
public class Seconds {

    private final Integer value;

    private Seconds(Integer value){
        Preconditions.checkNotNull(value);
        Preconditions.checkArgument(value>=0 && value<=59);
        this.value = value;
    }

}
