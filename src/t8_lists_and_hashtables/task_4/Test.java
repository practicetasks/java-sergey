package t8_lists_and_hashtables.task_4;

import java.util.HashMap;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, Double> currencies = new HashMap<>();
        currencies.put("USD", 534.9);
        currencies.put("EUR", 627.23);
        currencies.put("RUB", 6.54);

        System.out.println("Введите сумму в тг: ");
        Double tenge = scanner.nextDouble();

        System.out.println("Введите валюту");
        String currency = scanner.next();
        if (!currencies.containsKey(currency)) {
            System.out.println("Валюта не найдена");
            return;
        }

        Double rate = currencies.get(currency);
        System.out.println(tenge + " тг в " + currency + " составляет: " + tenge / rate);


    }
}
