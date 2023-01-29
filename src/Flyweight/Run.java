package Flyweight;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        ReaderFactory readerFactory = new ReaderFactory();

        List<Reader> readers =new ArrayList<>();

        readers.add(readerFactory.getReaderByPurpose("File"));
        readers.add(readerFactory.getReaderByPurpose("File"));
        readers.add(readerFactory.getReaderByPurpose("File"));
        readers.add(readerFactory.getReaderByPurpose("File"));
        readers.add(readerFactory.getReaderByPurpose("File"));
        readers.add(readerFactory.getReaderByPurpose("File"));
        readers.add(readerFactory.getReaderByPurpose("Console"));
        readers.add(readerFactory.getReaderByPurpose("Console"));
        readers.add(readerFactory.getReaderByPurpose("Console"));
        readers.add(readerFactory.getReaderByPurpose("Console"));
        readers.add(readerFactory.getReaderByPurpose("Console"));

        for(Reader reader: readers){
            reader.read();
        }
    }
}
