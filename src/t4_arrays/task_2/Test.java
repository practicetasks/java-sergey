package t4_arrays.task_2;

public class Test {
    public static void main(String[] args) {
        int[] may2022 = {
                26, 19, 13, 17, 20, 24, 12, 17, 21, 19, 20, 23, 26, 25, 24, 27, 26, 18, 20, 25, 31, 20, 22, 28, 30, 34, 31, 16, 27, 30, 24
        };

        int maxTemp = may2022[0];
        int maxTempDay = 0;

        int minTemp = may2022[0];
        int minTempDay = 0;


        for (int i = 0; i < may2022.length; i++) {
            if (may2022[i] > maxTemp) {
                maxTemp = may2022[i];
                maxTempDay = i + 1;
            }

            if (may2022[i] < minTemp) {
                minTemp = may2022[i];
                minTempDay = i + 1;
            }
        }

        System.out.println(maxTemp + " " + maxTempDay);
        System.out.println(minTemp + " " + minTempDay);
    }
}
