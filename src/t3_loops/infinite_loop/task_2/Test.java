package t3_loops.infinite_loop.task_2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Американо");
            System.out.println("2. Капучино");
            System.out.println("3. Латте");
            System.out.println("0. Выйти");
            int command = scanner.nextInt();
            switch (command) {
                case 1 -> System.out.println("Вы выбрали Американо");
                case 2 -> System.out.println("Вы выбрали Капучино");
                case 3 -> System.out.println("Вы выбрали Латте");
                case 0 -> {
                    System.out.println("Вы вышли из меню");
                    return;
                }
            }
        }
    }
}
