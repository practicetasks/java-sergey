package t5_methods.task_1;

public class Test {
    public static void main(String[] args) {
        showInfo("Иван", "Иванов", 25);
    }

    private static void showInfo(String name, String lastname, int age) {
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + lastname);
        System.out.println("Возраст: " + age);
    }
}
