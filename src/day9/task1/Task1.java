package day9.task1;

public class Task1 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Anatol", "math");
        Student student = new Student("Dima", "cartography");
        System.out.println(teacher.getSubject());
        System.out.println(student.getGroup());
        teacher.printInfo();
        student.printInfo();
    }
}
