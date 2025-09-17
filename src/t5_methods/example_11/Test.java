package t5_methods.example_11;

public class Test {
    public static void main(String[] args) {
        int number = 7;
        number = increase(number);
        System.out.println(number);
    }

    static int increase(int num) {
        num = num + 1;
        return num;
    }
}
