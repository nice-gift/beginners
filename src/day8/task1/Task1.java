package day8.task1;

public class Task1 {
    public static void main(String[] args) {
        runBuilder();
        runString();
    }

    public static void runBuilder() {
        long startTime = System.currentTimeMillis();

        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 20_000; i++) {
            s.append(i).append(" ");
        }
        System.out.println(s);

        System.out.println(System.currentTimeMillis() - startTime);

    }

    public static void runString() {
        long startTime = System.currentTimeMillis();

        String s = "";
        for (int i = 0; i < 20_000; i++) {
            s += i + " ";
        }
        System.out.println(s);

        System.out.println(System.currentTimeMillis() - startTime);
    }
}
