package Builder;

public class ClassicBookBuilder extends  BookBuilder {
    @Override
    void buildName() {
        book.setName("Classical literature");
    }

    @Override
    void buildPageCount() {
        book.setPageCount(500);
    }

    @Override
    void buildHardCover() {
        book.setHardCover(true);
    }
}
