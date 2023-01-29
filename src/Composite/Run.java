package Composite;

public class Run {
    public static void main(String[] args) {
        Composite composite = new Composite();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Dog dog = new Dog();

        composite.addComponent(cat1);
        composite.addComponent(cat2);
        composite.addComponent(dog);

        composite.makeSound();
    }
}
