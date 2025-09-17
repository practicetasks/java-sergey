package t8_lists_and_hashtables.example_4;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        addTask(list, scanner);

        System.out.println(list);
    }

    static void addTask(ArrayList<String> list, Scanner scanner) {
        list.add("A");
    }
}
