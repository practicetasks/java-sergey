package t3_loops.infinite_loop.task_1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пароль");
        String password = scanner.next();
        while (true) {
            if (password.equals("admin")) {
                System.out.println("Доступ разрешен");
                break;
            }
            System.out.println("Неверный пароль, попробуйте еще раз");
            password = scanner.next();
        }
    }
}
