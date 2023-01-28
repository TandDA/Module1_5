package FactoryMethod;

public class PhysicsTeacherFactory implements TeacherFactory{
    @Override
    public Teacher createTeacher() {
        return new PhysicsTeacher();
    }
}
