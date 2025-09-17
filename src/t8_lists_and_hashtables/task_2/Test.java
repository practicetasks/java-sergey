package t8_lists_and_hashtables.task_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить задачу");
            System.out.println("2. Показать все задачи");
            System.out.println("3. Удалить задачу");
            System.out.println("4. Очистить список задач");
            System.out.println("0. Выйти из программы");

            switch (scanner.nextLine()) {
                case "1" -> {
                    System.out.println("Введите задачу:");
                    String task = scanner.nextLine();
                    list.add(task);
                    System.out.println("Задача добавлена: \"" + task + "\"");
                }
                case "2" -> {
                    if (list.isEmpty()) {
                        System.out.println("Список задач пуст");
                        break;
                    }
                    System.out.println("Текущий список задач:");
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println((i + 1) + ". " + list.get(i));
                    }
                }
                case "3" -> {
                    if (list.isEmpty()) {
                        System.out.println("Список задач пуст, нечего удалять");
                        break;
                    }
                    System.out.println("Выберите номер задачи для удаления:");
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println((i + 1) + ". " + list.get(i));
                    }
                    int removeIdx = Integer.parseInt(scanner.nextLine());
                    if (removeIdx >= 1 && removeIdx <= list.size()) {
                        String removed = list.remove(removeIdx - 1);
                        System.out.println("Задача \"" + removed + "\" удалена");
                    } else {
                        System.out.println("Неверный номер задачи");
                    }
                }
                case "4" -> {
                    if (list.isEmpty()) {
                        System.out.println("Список уже пуст");
                    } else {
                        list.clear();
                        System.out.println("Все задачи удалены");
                    }
                }
                case "0" -> {
                    System.out.println("Работа программы завершена");
                    return;
                }
                default -> System.out.println("Некорректный выбор, попробуйте снова");
            }
            System.out.println();
        }
    }
}