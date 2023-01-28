package FactoryMethod;

public class MathTeacherFactory implements  TeacherFactory{
    @Override
    public Teacher createTeacher() {
        return new MathTeacher();
    }
}
