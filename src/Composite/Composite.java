package Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Animal{
    private List<Animal> components = new ArrayList<>();
    public void addComponent(Animal animal){
        components.add(animal);
    }
    public void removeComponent(Animal animal){
        components.remove(animal);
    }
    @Override
    public void makeSound() {
        for(Animal animal : components){
            animal.makeSound();
        }
    }
}
