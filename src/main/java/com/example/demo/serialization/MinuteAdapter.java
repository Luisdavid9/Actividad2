package com.example.demo.serialization;

import com.example.demo.time.domain.Minutes;
import com.google.gson.*;

import java.lang.reflect.Type;

public class MinuteAdapter implements JsonSerializer<Minutes>, JsonDeserializer<Minutes> {

    @Override
    public JsonElement serialize(Minutes minute, Type typeOfSrc, JsonSerializationContext context) {
        Integer value = minute.getValue();
        return new JsonPrimitive(value);
    }

    @Override
    public Minutes deserialize(JsonElement json, Type TypeOfT, JsonDeserializationContext context)
            throws JsonParseException{

        Integer value = json.getAsInt();
        return Minutes.of(value);
    }
}
