package FactoryMethod;

public class PhysicsTeacher implements Teacher{
    @Override
    public void teach() {
        System.out.println("Учу физике");
    }
}
