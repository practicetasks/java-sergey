package t8_lists_and_hashtables.example_5;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

public class Test {
    public static void main(String[] args) {
        // Списки
//        ArrayList<String> cities = new ArrayList<>();
//        cities.add("Berlin");
//        cities.add("Sydney");
//        cities.add("Tokyo");
//        cities.add("Almaty");
//
//        for (int i = 0; i < cities.size(); i++) {
//            System.out.println(cities.get(i));
//        }
//
//        for (String city : cities) {
//            System.out.println(city);
//        }

//        for (int i = 0; i < cities.size(); i++) {
//            if (cities.get(i).equals("Almaty")) {
//                cities.set(i, "Astana");
//            }
//        }
//
//        for (int i = 0; i < cities.size(); i++) {
//            if (cities.get(i).equals("Tokyo")) {
//                cities.remove(i);
//                break;
//            }
//        }
//        System.out.println(cities.get(3));

        // Хэш-таблица
        HashMap<String, String> citiesMap = new HashMap<>();
        citiesMap.put("Kazakhstan", "Almaty");
        citiesMap.put("Germany", "Berlin");
        citiesMap.put("Australia", "Sydney");
        citiesMap.put("Japan", "Tokyo");

//        System.out.println(citiesMap.containsKey("Kazakhstan"));
//        System.out.println(citiesMap.containsKey("Uzbekistan"));

        System.out.println(citiesMap.containsValue("Almaty"));
        System.out.println(citiesMap.containsValue("Paris"));



//        System.out.println(0.1 + 0.2);
        // Создать хэш-таблицу students
        // Bob: 92.1
        // Sam: 87.6
        // Jack: 89.22
        // Tom: 92.0

        // заменить у Bob оценку на 93.5
        // вывести среднюю оценку студентов

    }
}
