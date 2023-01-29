package Builder;

public abstract class BookBuilder {
    Book book;

    void createBook(){
        book = new Book();
    }
    abstract void buildName();
    abstract void buildPageCount();
    abstract void buildHardCover();

    Book getBook(){
        return book;
    }
}
