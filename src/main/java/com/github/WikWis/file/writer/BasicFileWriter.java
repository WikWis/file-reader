package com.github.WikWis.file.writer;

import com.github.WikWis.file.reader.ObjectReaderException;
import com.github.WikWis.line.serializer.LineSerializer;
import com.github.WikWis.line.serializer.LineSerializerException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;
import java.util.stream.Collectors;

public class BasicFileWriter<T> implements ObjectFileWriter<T> {

    public void writeFile(File file, LineSerializer<T> serializer, List<T> list) throws ObjectReaderException {
        try {
            String data = parseList(list, serializer);
            PrintWriter pw = new PrintWriter(file);
            pw.println(data);
            pw.close();
        } catch (FileNotFoundException | LineSerializerException e) {
            throw new ObjectReaderException(e.getMessage());
        }
    }

    private String parseList(List<T> list, LineSerializer<T> serializer) throws LineSerializerException {
        return list.stream()
                .map(serializer::serialize)
                .collect(Collectors.joining("\n"));

    }
}
