package t8_lists_and_hashtables.example_6;

import java.util.ArrayList;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        ArrayList<String> kazakhstanCities = new ArrayList<>();
        kazakhstanCities.add("Almaty");
        kazakhstanCities.add("Astana");
        kazakhstanCities.add("Semey");
        kazakhstanCities.add("Aktobe");
        map.put("Kazakhstan", kazakhstanCities);

        ArrayList<String> germanyCities = new ArrayList<>();
        germanyCities.add("Hamburg");
        germanyCities.add("Munchen");
        germanyCities.add("Dresden");
        map.put("Germany", germanyCities);

        map.get("Kazakhstan").add("Aktau");

        // TODO:
        //  1) посчитать среднюю оценку студента Bob
        //  2) добавить оценку для Sam 97.5
        //  3) вывести все оценки студента Tom
        //  4) вывести ср. оценку всех студентов

    }
}
