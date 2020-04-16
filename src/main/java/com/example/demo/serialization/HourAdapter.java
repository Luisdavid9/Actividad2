package com.example.demo.serialization;

import com.example.demo.time.domain.Hour;
import com.google.gson.*;

import java.lang.reflect.Type;



public class HourAdapter implements JsonDeserializer<Hour>, JsonSerializer<Hour> {

    @Override
    public JsonElement serialize(Hour hour, Type typeOfSrc, JsonSerializationContext context) {
        Integer value = hour.getValue();
        return new JsonPrimitive(value);
    }

    @Override
    public Hour deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
            throws JsonParseException{
        Integer value = json.getAsInt();
        return Hour.of(value);
    }

}
