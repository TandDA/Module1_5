package Prototype;

public class BookFactory {
    Book book;

    public BookFactory(Book book) {
        this.book = book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
    public Book cloneBook(){
        return (Book)book.copy();
    }
}
