import models.Student;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello amigo!");

        Student student = new Student(7, "Bake", true);

        System.out.println(student);
    }
}
