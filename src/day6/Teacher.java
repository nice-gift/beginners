package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate(Student student) {
        Random random = new Random();
        int mark = random.nextInt(6 - 2) + 2;
        String markStr = "";

        switch (mark) {
            case 2:
                markStr = "неудовлетворительно";
                break;
            case 3:
                markStr = "удовлетворительно";
                break;
            case 4:
                markStr = "хорошо";
                break;
            case 5:
                markStr = "отлично";
                break;
        }

        System.out.println("Преподаватель " + name + " оценил студента с именем "
                + student.getName() + " по предмету " + subject + " на оценку "
                + markStr);
    }
}
