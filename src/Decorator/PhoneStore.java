package Decorator;

public class PhoneStore implements Store{
    @Override
    public String sellProduct() {
        return "Продаем телефоны.";
    }
}
