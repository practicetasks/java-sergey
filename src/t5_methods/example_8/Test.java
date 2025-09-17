package t5_methods.example_8;

public class Test {
    public static void main(String[] args) {
        int age = 28;
        yearsLater(age);
        System.out.println(age);
    }

    static void yearsLater(int age) {
        System.out.println(age);
        age++;
        System.out.println(age);
    }
}
