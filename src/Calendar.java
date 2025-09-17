import java.time.Month;

public class Calendar {
    public static void main(String[] args) {
        int currentDay = 0;
        for (Month month : Month.values()) {
            System.out.println(month);
            for (int i = 0; i < currentDay; i++) {
                System.out.print("   ");
            }
            for (int i = 1; i <= month.maxLength(); i++) {
                currentDay++;
                System.out.printf("%-2d ", i);
                if (currentDay % 7 == 0) {
                    currentDay = 0;
                    System.out.println();
                }
            }
            System.out.println("\n");

        }
    }
}
