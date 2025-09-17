package t5_methods.example_9;

import java.util.Arrays;

public class Test {
    public static void main(String[] a) {

        int[] result1 = fizzArray(1);
        System.out.println(Arrays.toString(result1)); //  → [0, 1]

        int[] result2 = fizzArray(5);
        System.out.println(Arrays.toString(result2)); //  → [0, 1, 2, 3, 4, 5]

        int[] result3 = fizzArray(0);
        System.out.println(Arrays.toString(result3)); //  → [0]
    }

    public static int[] fizzArray(int n) {
        int[] arr = new int[n + 1];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = i;
        }
        return arr;
    }

//    public static int[] shiftLeft(int[] nums) {
//        int first = nums[0];
//        for (int i = 0; i < nums.length - 1; i++) {
//            nums[i] = nums[i + 1];
//        }
//        nums[nums.length - 1] = first;
//        return nums;

//    }



//    public static boolean no14(int[] nums) {
//
//    }
//
//
//    public static boolean sameFirstLast(int[] nums) {
//
//    }
//
//
//    // TODO: Даны три целых числа a b c, вернуть true,
//    //  если возможно сложить два целых числа, чтобы получить третье.
//    public static boolean twoAsOne(int a, int b, int c) {
//
//    }
}

