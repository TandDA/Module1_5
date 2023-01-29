package Flyweight;

public class FileRead implements Reader{
    @Override
    public void read() {
        System.out.println("Информация из файла");
    }
}
