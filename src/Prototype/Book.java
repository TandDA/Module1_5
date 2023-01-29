package Prototype;

public class Book implements Copyable {
    private String name;
    private int pageCount;
    private boolean hardCover;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public boolean isHardCover() {
        return hardCover;
    }

    public void setHardCover(boolean hardCover) {
        this.hardCover = hardCover;
    }

    public Book(String name, int pageCount, boolean hardCover) {
        this.name = name;
        this.pageCount = pageCount;
        this.hardCover = hardCover;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", pageCount=" + pageCount +
                ", hardCover=" + hardCover +
                '}';
    }

    @Override
    public Object copy() {
        return new Book(name,pageCount,hardCover);
    }
}
