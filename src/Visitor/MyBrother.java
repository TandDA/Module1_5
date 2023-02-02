package Visitor;

public class MyBrother implements Kitchener {
    @Override
    public void cook(PeelPotatoes projectClass) {
        System.out.println("Идеально почистил кортошку...");
    }

    @Override
    public void cook(FryPotatoes fryPotatoes) {
        System.out.println("Жарка до хрустящей корочки...");
    }

    @Override
    public void cook(SprinkleSpices sprinkleSpices) {
        System.out.println("Идеальое количество специй...");
    }
}
