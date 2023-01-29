package Prototype;

public class Run {
    public static void main(String[] args) {
        Book faust = new Book("Faust",600,true);
        BookFactory bookFactory = new BookFactory(faust);
        Book faustClone = bookFactory.cloneBook();

        System.out.println(faust);
        System.out.println(faustClone);
    }
}
