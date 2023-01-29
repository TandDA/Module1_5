package Decorator;

public class StoreDecorator implements Store{
    Store store;

    public StoreDecorator(Store store) {
        this.store = store;
    }

    @Override
    public String sellProduct() {
        return store.sellProduct();
    }
}
