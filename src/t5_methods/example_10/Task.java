package t5_methods.example_10;

public class Task {
    public static void main(String[] args) {

        int days = 2;
        processRentalOrder(days);
    }

    public static void processRentalOrder(int days) {
        double price = calculatePrice(days);
    }

    public static double calculatePrice(int days) {
        return days * 10_000;
    }
}
