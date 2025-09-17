package t5_methods.task_2;

public class Test {
    public static void main(String[] args) {
        showDate(2025, 11, 16);
        showDate(2025, 1, 16);
        showDate(2025, 11, 6);
        showDate(2025, 1, 6);
    }

    private static void showDate(int year, int month, int day) {
        System.out.printf("Дата: %d.%02d.%02d\n", year, month, day);
    }
}
