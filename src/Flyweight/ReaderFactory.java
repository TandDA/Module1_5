package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class ReaderFactory {
    private static final Map<String,Reader> readers = new HashMap<>();

    public Reader getReaderByPurpose(String purpose){
        Reader reader = readers.get(purpose);

        if(reader == null){
            switch (purpose){
                case "File":
                    reader = new FileRead();
                    break;
                case "Console":
                    reader = new ConsoleRead();
                    break;
            }
            readers.put(purpose,reader);
        }
        return reader;
    }
}
