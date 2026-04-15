package com.github.WikWis.file.writer;

import com.github.WikWis.file.reader.ObjectReaderException;
import com.github.WikWis.line.serializer.LineSerializer;

import java.io.File;
import java.util.List;

public interface ObjectFileWriter<T> {
    void writeFile(File file, LineSerializer<T> serializer, List<T> list) throws ObjectReaderException;
}
