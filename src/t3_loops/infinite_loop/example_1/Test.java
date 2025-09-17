package t3_loops.infinite_loop.example_1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
        }
    }
}
