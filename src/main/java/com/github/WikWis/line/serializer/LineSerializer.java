package com.github.WikWis.line.serializer;

public interface LineSerializer<T> {
    String serialize(T t);
}
