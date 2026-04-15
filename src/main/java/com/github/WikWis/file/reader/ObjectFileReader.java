package com.github.WikWis.file.reader;

import com.github.WikWis.line.deserializer.LineDeserializer;

import java.io.File;
import java.util.List;

public interface ObjectFileReader<T> {
    List<T> readFile(File file, LineDeserializer<T> reader) throws ObjectReaderException;
}
