package Builder;

public class MagazineBookBuilder extends BookBuilder{
    @Override
    void buildName() {
        book.setName("Magazine");
    }

    @Override
    void buildPageCount() {
        book.setPageCount(30);
    }

    @Override
    void buildHardCover() {
        book.setHardCover(false);
    }
}
