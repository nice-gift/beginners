package day6;

import java.util.GregorianCalendar;

public class Motorbike {
    private int yearOfIssue;
    private String color;
    private String model;

    public Motorbike() {
        yearOfIssue = 1960;
        color = "black";
        model = "vw";
    }

    public Motorbike(int yearOfIssue, String color, String model) {
        this.yearOfIssue = yearOfIssue;
        this.color = color;
        this.model = model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        GregorianCalendar calendar = new GregorianCalendar();
        if (yearOfIssue > 0 && yearOfIssue < calendar.get(GregorianCalendar.YEAR)) {
            this.yearOfIssue = yearOfIssue;
        } else System.out.println("Wrong value!");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void info() {
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int year) {
        return year - yearOfIssue;
    }
}
