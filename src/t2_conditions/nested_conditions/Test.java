package t2_conditions.nested_conditions;

public class Test {
    public static void main(String[] args) {

        String apple = "red";
        boolean hasFruit = false;

        if (apple.equals("red")) {
            if (hasFruit) {
                System.out.println("Купить 1 кг яблок");
            } else {
                System.out.println("Купить 3 кг яблок");
            }
        } else {
            System.out.println("Берите апельсины");
        }
    }
}
