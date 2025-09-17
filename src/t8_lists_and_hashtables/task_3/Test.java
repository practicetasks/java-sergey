package t8_lists_and_hashtables.task_3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> person1 = new ArrayList<>();
        person1.add("java");
        person1.add("go");
        person1.add("python");
        person1.add("javascript");

        ArrayList<String> person2 = new ArrayList<>();
        person2.add("kotlin");
        person2.add("python");
        person2.add("dart");
        person2.add("javascript");

        // TODO: найти общие элементы
        //  python, javascript

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);

        ArrayList<Integer> result = getEvenNumbers(numbers);
        System.out.println(result); // [2,4,6,8]

        int maxResult = getMaxNum(numbers);
        System.out.println(maxResult); // 9
    }

    static int getMaxNum(ArrayList<Integer> nums) {
        int max = 0;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    static ArrayList<Integer> getEvenNumbers(ArrayList<Integer> nums) {
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer num : nums) {
            if (num % 2 == 0) {
                result.add(num);
            }
        }
        return result;
    }
}
