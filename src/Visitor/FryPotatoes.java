package Visitor;

public class FryPotatoes implements CookingElement {
    @Override
    public void beCooked(Kitchener kitchener) {
        kitchener.cook(this);
    }
}
