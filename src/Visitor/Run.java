package Visitor;

public class Run {
    public static void main(String[] args) {
        Dish dish = new Dish();

        Kitchener me = new Me();
        Kitchener myBrother = new MyBrother();

        System.out.println("Я готовлю...");
        dish.beCooked(me);

        System.out.println("\n========\n");

        System.out.println("Мой брат готовит...");
        dish.beCooked(myBrother);
    }
}
