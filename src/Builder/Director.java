package Builder;

public class Director {
    BookBuilder builder;

    public Director(BookBuilder builder){
        this.builder = builder;
    }
    public void setBuilder(BookBuilder builder){
        this.builder = builder;
    }
    Book buildBook(){
        builder.createBook();
        builder.buildName();
        builder.buildPageCount();
        builder.buildHardCover();

        return builder.getBook();
    }
}
