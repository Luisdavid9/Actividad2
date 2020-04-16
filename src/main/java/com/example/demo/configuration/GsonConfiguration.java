package com.example.demo.configuration;

import com.example.demo.serialization.HourAdapter;
import com.example.demo.serialization.MinuteAdapter;
import com.example.demo.serialization.SecondAdapter;
import com.example.demo.time.domain.Hour;
import com.example.demo.time.domain.Minutes;
import com.example.demo.time.domain.Seconds;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GsonConfiguration {
    @Bean
    public Gson gson() {
        return new GsonBuilder()
                .registerTypeAdapter(Hour.class, new HourAdapter())
                .registerTypeAdapter(Minutes.class, new MinuteAdapter())
                .registerTypeAdapter(Seconds.class, new SecondAdapter())
                .create();
    }
}
