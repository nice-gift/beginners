package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = "";
        String country = "";

        do {
            System.out.print("Введите название города: ");
            city = scanner.nextLine();
            switch (city) {
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    country = "Россия";
                    break;
                case "Рим":
                case "Милан":
                case "Турин":
                    country = "Италия";
                    break;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    country = "Англия";
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кёльн":
                    country = "Германия";
                    break;
                default:
                    country = "Неизвестная страна";
            }
            System.out.println(country);
        }
        while (!city.equals("Stop"));
        System.out.println("Программа завершена");
    }
}
