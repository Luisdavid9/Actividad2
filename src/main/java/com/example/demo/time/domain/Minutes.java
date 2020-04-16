package com.example.demo.time.domain;

import com.example.demo.common.Preconditions;
import lombok.Value;

@Value(staticConstructor = "of")
public class Minutes {

    private final Integer value;
    private Minutes (Integer value){
        Preconditions.checkNotNull(value);
        Preconditions.checkArgument(value>=0 && value<=59);
        this.value = value;
    }
}
