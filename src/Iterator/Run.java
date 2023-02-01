package Iterator;

public class Run {
    public static void main(String[] args) {
        String[] products = {"Гречка","Хлеб", "Газировка"};
        Store magnit = new Store(products);

        Iterator iterator = magnit.getIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }
}
