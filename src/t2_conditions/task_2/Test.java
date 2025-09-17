package t2_conditions.task_2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println("Число положительное");
        } else if (num == 0) {
            System.out.println("Число равно нулю");
        } else {
            System.out.println("Число отрицательное");
        }
    }
}
