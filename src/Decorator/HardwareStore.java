package Decorator;

public class HardwareStore extends StoreDecorator{


    public HardwareStore(Store store) {
        super(store);
    }
    public  String sellOtherTechniques(){
        return "Продаем всякую технику. ";
    }
    @Override
    public String sellProduct() {
        return super.sellProduct()+sellOtherTechniques();
    }
}
