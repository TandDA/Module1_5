package Visitor;

public class Dish implements CookingElement {
    CookingElement[] cookingElements;

    public Dish() {
        this.cookingElements = new CookingElement[]{
                new PeelPotatoes(),
                new FryPotatoes(),
                new SprinkleSpices()
        };
    }

    @Override
    public void beCooked(Kitchener kitchener) {
        for (CookingElement element : cookingElements) {
            element.beCooked(kitchener);
        }
    }
}
