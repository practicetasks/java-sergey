package t3_loops.task_1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите кол-во чисел: ");
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            System.out.print("Введите число: " );
            sum += scanner.nextInt();
        }
        System.out.println("Количество чисел: " + num);
        System.out.println("Сумма всех чисел: " + sum);
        System.out.println("Среднее значение: " + sum / num);
    }
}
