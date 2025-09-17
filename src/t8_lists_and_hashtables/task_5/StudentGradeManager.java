package t8_lists_and_hashtables.task_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentGradeManager {
    private final Map<String, Double> grades = new HashMap<>();
    private final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        StudentGradeManager manager = new StudentGradeManager();
        manager.run();
    }

    public void run() {
        System.out.println("1. Добавить студента");
        System.out.println("2. Распечатать всех студентов");
        System.out.println("3. Посчитать среднее значение");
        System.out.println("0. Выйти");

        while (true) {
            System.out.print("Выберите команду: ");
            int command = Integer.parseInt(scanner.nextLine());

            switch (command) {
                case 1 -> addGrade();
                case 2 -> viewGrades();
                case 3 -> showAverage();
                case 0 -> {
                    System.out.println("Выход из программы...");
                    return;
                }
                default -> System.out.println("Неизвестная команда");
            }
            System.out.println();
        }
    }

    private void addGrade() {
        System.out.print("Введите имя студента: ");
        String name = scanner.nextLine();

        System.out.print("Введите оценку (0-100): ");
        try {
            double grade = Double.parseDouble(scanner.nextLine());

            if (grade < 0 || grade > 100) {
                System.out.println("Оценка должна быть от 0 до 100!");
                return;
            }

            grades.put(name, grade);
            System.out.println("Оценка добавлена: " + name + " = " + grade);

        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введите число!");
        }
    }

    private void viewGrades() {
        if (grades.isEmpty()) {
            System.out.println("Нет добавленных оценок.");
            return;
        }

        System.out.println("\n=== Все оценки ===");
        for (Map.Entry<String, Double> entry : grades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private void showAverage() {
        if (grades.isEmpty()) {
            System.out.println("Нет данных для расчета среднего значения.");
            return;
        }

        double sum = 0;
        for (double grade : grades.values()) {
            sum += grade;
        }

        double average = sum / grades.size();
        System.out.printf("Средняя оценка: %.2f\n", average);
    }
}
