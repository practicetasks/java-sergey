package t5_methods.example_5;

public class Test {
    public static void main(String[] args) {
        System.out.println(get("Michael", true));
        System.out.println(get("Kate", false));

        // метод должен возвращать true если пользователю есть 18
//        boolean result = isAdult(21);
//        System.out.println(result);      // true
//        System.out.println(isAdult(11)); // false

        // метод должен возвращать наибольшее число их трех
//        int[] nums = {56, 14, 23, 23, 67 ,78};
//        int result = max(nums);
//        System.out.println(result); // 78
    }

    static boolean isAdult(int age) {
        return age >= 18;
    }

    static String get(String name, boolean isMale) {
        if (isMale) {
            return "Mr. " + name;
        } else {
            return "Ms. " + name;
        }
    }

    static int add(int a, int b) {
        return a + b;
    }


}




