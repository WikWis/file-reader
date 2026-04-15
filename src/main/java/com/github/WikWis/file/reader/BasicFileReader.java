package com.github.WikWis.file.reader;

import com.github.WikWis.line.deserializer.LineDeserializer;
import com.github.WikWis.line.deserializer.LineDeserializerException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BasicFileReader<T> implements ObjectFileReader<T> {
    @Override
    public List<T> readFile(File file, LineDeserializer<T> deserializer) throws ObjectReaderException {
        List<T> objects = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                T object = deserializer.deserialize(line);
                objects.add(object);
            }
        } catch (FileNotFoundException | LineDeserializerException e) {
            throw new ObjectReaderException(e.getMessage());
        }
        return objects;
    }
}
