package Visitor;

public class PeelPotatoes implements CookingElement {
    @Override
    public void beCooked(Kitchener kitchener) {
        kitchener.cook(this);
    }
}
