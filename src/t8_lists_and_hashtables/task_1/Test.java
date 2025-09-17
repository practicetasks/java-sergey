package t8_lists_and_hashtables.task_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            System.out.println("Введите число (exit для завершения)");
            String input = scanner.next();
            if (input.equals("exit")) {
                break;
            }

            list.add(Integer.parseInt(input));
        }

        System.out.println(list);
        System.out.println("Количество чисел: " + list.size());
        System.out.println("Сумма чисел: " + list.stream().mapToInt(x -> x).sum());
    }
}
