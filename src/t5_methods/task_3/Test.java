package t5_methods.task_3;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] radiohead = {1993, 1995, 1997, 2000, 2001, 2003, 2007, 2011, 2016};
        showInterval(radiohead);
        showChronology(radiohead);

        int[] kendrickLamar = {2011, 2012, 2015, 2016, 2017, 2022, 2024};
        showInterval(kendrickLamar);
        showChronology(kendrickLamar);

        int[] bjork = {1977, 1990, 1993, 1995, 1997, 2001, 2004, 2007, 2011, 2015, 2017, 2022};
        showInterval(bjork);
        showChronology(bjork);
    }

    private static void showChronology(int[] album) {
        int count = 0;
        for (int i = album[0]; i <= album[album.length - 1]; i++) {
            if (i == album[count]) {
                count++;
                System.out.print("*");
            } else {
                System.out.print("-");
            }
        }
        System.out.println("\n");
    }

    private static void showInterval(int[] arr) {
        int maxInterval = 0;
        int[] intervals = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            int interval = arr[i + 1] - arr[i];
            intervals[i] = interval;
            if (interval > maxInterval) {
                maxInterval = interval;
            }
        }
        System.out.println("Интервалы между выпусками альбомов в годах: " + Arrays.toString(intervals));
        System.out.println("Самый продолжительный период без альбомов: " + maxInterval);
    }
}
