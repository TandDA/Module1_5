package Visitor;

public class Me implements Kitchener {
    @Override
    public void cook(PeelPotatoes peelPotatoes) {

        System.out.println("Срезаю слишком много...");
    }

    @Override
    public void cook(FryPotatoes fryPotatoes) {
        System.out.println("Пережариваю...");
    }

    @Override
    public void cook(SprinkleSpices sprinkleSpices) {
        System.out.println("Перебо со специями...");
    }
}
