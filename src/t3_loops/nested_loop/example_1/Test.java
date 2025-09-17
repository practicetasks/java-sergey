package t3_loops.nested_loop.example_1;

public class Test {
    public static void main(String[] args) {


        int flatsNumber = 5; // Количество квартир на этаже
        int floorsNumber = 10; // Количество этажей

        for (int i = 1; i <= floorsNumber; i++) {
            for (int j = 1; j <= flatsNumber; j++) {
                int currentFlat = (i - 1) * flatsNumber + j;
                System.out.println("Этаж " + i + " квартира " + currentFlat + " — доставлено.");
            }
        }

        // Вы решили заниматься английским языком,
        //  и планируете на протяжении 30 дней смотреть по 3 серий сериала в день

        // День 1 Серия 1
        // День 1 Серия 2
        // День 1 Серия 3
        // День 2 Серия 1
        // День 2 Серия 2
        // День 2 Серия 3
        // День 3 Серия 1
        // День 3 Серия 2
        // День 3 Серия 3
        // ...
        // День 30 Серия 1
        // День 30 Серия 2
        // День 30 Серия 3





    }
}
