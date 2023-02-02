package Visitor;

public class SprinkleSpices implements CookingElement {
    @Override
    public void beCooked(Kitchener kitchener) {
        kitchener.cook(this);
    }
}
