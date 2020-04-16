package com.example.demo.time.domain;

import com.example.demo.common.Preconditions;
import lombok.Value;

@Value(staticConstructor = "of")
public class Hour {

    private final Integer value;

    private Hour(Integer value) {
        Preconditions.checkNotNull(value);
        Preconditions.checkArgument(value >= 0 && value <= 23);
        this.value = value;
    }


}
