package t2_conditions.nested_conditions.task_1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму заказа");
        double sum = scanner.nextInt();

        if (sum >= 100_000) {
            System.out.println("Введите процент скидки  (от 5 до 50)");
            int percent = scanner.nextInt();
            if (percent >= 5 && percent <= 50) {
                double sale = sum * (percent / 100.0);
                sum -= sale;
                System.out.println("Вам предоставлена скидка в размере " + percent+"%, что составляет: " + sale);
            } else {
                System.out.println("Ошибка: процент скидки должна быть от 5 до 50");
            }
        } else {
            System.out.println("Скидка не доступна");
        }
        System.out.println("Итого к оплате: " + sum);






        // Введите сумму заказа: ___
        // Если сумма заказа больше 100тыс:
            // Введите процент скидки (от 5 до 50): ___
            // Если скидка от 5 до 50
                // Вам предоставлена скидка в размере __%, что составляет: ...
            // Иначе:
                // Ошибка: скидка должна быть от 5 до 50
        // Иначе:
            // Скидка не доступна
        // Итого к оплате: ___

    }
}
