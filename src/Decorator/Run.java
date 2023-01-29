package Decorator;

public class Run {
    public static void main(String[] args) {
        Store store = new Mall(new HardwareStore(new PhoneStore()));

        System.out.println(store.sellProduct());
    }
}
