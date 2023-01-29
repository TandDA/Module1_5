package Decorator;

public class Mall extends StoreDecorator{

    public Mall(Store store) {
        super(store);
    }
    public  String sellAll(){
        return  "Продаем все что угодно. ";
    }
    @Override
    public String sellProduct() {
        return super.sellProduct() + sellAll();
    }
}
