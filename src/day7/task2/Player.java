package day7.task2;

import java.util.Random;

public class Player {
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;

    public static int countPlayers = 0;

    private int stamina;

    public Player() {
        if (countPlayers < 6) {
            Random random = new Random();
            stamina = random.nextInt(101 - 90) + 90;
            countPlayers++;
        } else System.out.println("Нельзя создать нового игрока");
    }

    public int getStamina() {
        return stamina;
    }

    public void run() {
        if (stamina > MIN_STAMINA) {
            stamina--;
            System.out.println("Running");
            if (stamina == 0) {
                countPlayers--;
            }
        } else System.out.println("The player on the bench");
    }

    public void info() {
        if (countPlayers == 5) {
            System.out.println("Команды неполные. На поле еще есть 1 " +
                    "свободное место");
        } else if (countPlayers < 6) {
            System.out.printf("Команды неполные. На поле еще есть %d " +
                    "свободных мест \n", 6 - countPlayers);
        } else System.out.println("На поле нет свободных мест");
    }
}
