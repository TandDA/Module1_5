package Builder;

public class Run {
    public static void main(String[] args) {
        Director director = new Director(new ClassicBookBuilder());
        Book faust = director.buildBook();
        director.setBuilder(new MagazineBookBuilder());
        Book magazine = director.buildBook();

        System.out.println(magazine);
        System.out.println(faust);
    }
}
