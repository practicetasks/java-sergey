package t5_methods.example_7;

public class Test {
    public static void main(String[] args) {
        String[] str = {"A", "A", "B", "A", "Z", "C", "D"};

//        find(str, "Z");
        find(str, "R");
    }

    static void find(String[] arr, String target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) {
                System.out.println("Элемент найден");
                return;
            }
        }
        System.out.println("Элемент не найден");
    }
}
