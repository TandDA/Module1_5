package FactoryMethod;

public class MathTeacher implements  Teacher {
    @Override
    public void teach() {
        System.out.println("Учу математике");
    }
}