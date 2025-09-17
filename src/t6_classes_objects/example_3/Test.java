package t6_classes_objects.example_3;

public class Test {
    public static void main(String[] args) {
        Product first = new Product();
        first.name = "iPhone 15 Pro";
        first.price = 649_990;

        Product second = new Product();
        second.name = "iPhone 12";
        second.price = 289_990;

        Product third = new Product();
        third.name = "Macbook Pro";
        third.price = 1_399_990;

        first.compareTo(third);
    }
}
