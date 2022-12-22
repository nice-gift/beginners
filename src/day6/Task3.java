package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Anatol Mikalaevich", "geo");
        Student student = new Student("Kirill Bogomaz");

        teacher.evaluate(student);
    }
}
