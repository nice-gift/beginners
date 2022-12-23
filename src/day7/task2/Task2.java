package day7.task2;

public class Task2 {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player();
        Player player5 = new Player();

        System.out.println(player1.getStamina());
        System.out.println(player2.getStamina());
        System.out.println(player3.getStamina());
        System.out.println(player4.getStamina());
        System.out.println(player5.getStamina());
        player1.info();

        Player player6 = new Player();
        System.out.println(player6.getStamina());
        player1.info();

        Player player7 = new Player();
        player1.info();
        System.out.println(Player.countPlayers);

        while (player1.getStamina() > 0) {
            player1.run();
            System.out.println(player1.getStamina());
        }
        System.out.println(Player.countPlayers);
    }
}
