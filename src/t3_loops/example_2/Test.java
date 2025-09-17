package t3_loops.example_2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // do-while
//        int a = 1;
//        do {
//            System.out.println(a);
//            a++;
//        } while (a > 5);

        // for
        // 1
//        int num = 1;
//        //      2
//        while (num <= 5) {
//            // 3
//            System.out.println(num);
//            // 4
//            num++;
//        }

//        for (int i = 10; i >= 1; i--) {
//            System.out.println(i);
//        }

//        for (int i = 1; i < 10; i++) {
//            System.out.println(i + " " + i * 5);
//        }


        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println("Круг " + i);
        }
    }
}
