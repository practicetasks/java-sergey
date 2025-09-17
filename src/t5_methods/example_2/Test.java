package t5_methods.example_2;

public class Test {
    public static void main(String[] args) {
        sayHello("Дима");
        sayHello("Денис");

//        formatFriendsCount(1); // У вас 1 друг
//        formatFriendsCount(2); // У вас 2 друга
//        formatFriendsCount(6); // У вас 6 друзей
//        formatFriendsCount(12); // У вас 12 друзей

        // 1 - друг
        // от 2 до 4 - друга
        // от 5 - друзей
    }

    public static void sayHello(String name) {
        System.out.println("Привет " + name);
    }
}
