package t2_conditions.task_3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите оценку");
        int score = scanner.nextInt();
        if (score >= 60) {
            System.out.println("Удовлетворительно");
        }
        if (score >= 75) {
            System.out.println("Хорошо");
        }
        if (score >= 90) {
            System.out.println("Отлично");
        } else {
            System.out.println("Неудовлетворительно");
        }
    }
}
