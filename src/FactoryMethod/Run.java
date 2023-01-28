package FactoryMethod;

public class Run {
    public static void main(String[] args) {
        TeacherFactory teacherFactory = createTeacherBySpecialty("Math");
        Teacher teacher = teacherFactory.createTeacher();

        teacher.teach();
    }
    static TeacherFactory createTeacherBySpecialty(String spec){
        switch (spec) {
            case "Math":
                return new MathTeacherFactory();
            case "Physics":
                return new PhysicsTeacherFactory();
            default:
                throw new RuntimeException();
        }
    }
}
