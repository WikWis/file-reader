package com.github.WikWis.line.deserializer;

public interface LineDeserializer<T> {
    T deserialize(String line) throws LineDeserializerException;
}
