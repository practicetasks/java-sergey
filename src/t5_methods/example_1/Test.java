package t5_methods.example_1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            scanner.nextInt();
        }
    }

    public static void printMenu() {
        System.out.println("1 - Добавить");
        System.out.println("2 - Обновить");
        System.out.println("3 - Распечатать");
        System.out.println("4 - Удалить");
    }

    public static void sayHello() {
        System.out.println("Привет мир");
    }
}
