package Iterator;

public class Store implements Collection{
    private String[] products;

    public Store(String[] products) {
        this.products = products;
    }

    @Override
    public Iterator getIterator() {
        return new ProductIterator();
    }

    public String[] getProducts() {
        return products;
    }

    public void setProducts(String[] products) {
        this.products = products;
    }
    private class ProductIterator implements Iterator{
        int index = 0;
        @Override
        public boolean hasNext() {
            return index < products.length;
        }

        @Override
        public Object next() {
            return products[index++];
        }
    }
}
