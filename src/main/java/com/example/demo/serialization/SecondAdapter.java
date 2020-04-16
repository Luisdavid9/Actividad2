package com.example.demo.serialization;


import com.example.demo.time.domain.Seconds;
import com.google.gson.*;

import java.lang.reflect.Type;

public class SecondAdapter implements JsonSerializer<Seconds>, JsonDeserializer<Seconds> {

    @Override
    public JsonElement serialize(Seconds seconds, Type typeOfSeconds, JsonSerializationContext context) {
        Integer value = seconds.getValue();
        return new JsonPrimitive(value);
    }

    @Override
    public Seconds deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
            throws JsonParseException {

        Integer value = json.getAsInt();
        return Seconds.of(value);
    }
}
