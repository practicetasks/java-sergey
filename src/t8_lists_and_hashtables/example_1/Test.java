package t8_lists_and_hashtables.example_1;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        // структура данных
        //  - массив
        //  - список

        // Отличия
        // 1) в массиве фиксированный размер, список увеличивается по мере необходимости
        // 2) массив работает с классами и примитивами, список работает только с классами
        // 3) в списке содержится много удобных методов, в массиве только свойство length

//        int[] nums = new int[10];
//        System.out.println(nums.length);
//        nums[0] = 23;
//        System.out.println(nums.length);


//        ArrayList<Integer> list = new ArrayList<>();
//
//        // добавление
//        list.add(1500);
//        list.add(3200);
//
//        // добавление в определенную позицию
//        list.add(1, 2000);
//
//        for (Integer num : list) {
//            System.out.println(num);
//        }


//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

//        // получение по индексу
//        System.out.println(list.get(0));
//
//        // получение размера
//        System.out.println(list.size());
//
//        System.out.println(list);

//        ArrayList<String> list = new ArrayList<>();
//        list.add("Java");
//        list.add("Python");
//        list.add("Haskell");
//        list.add("Swift");
//        list.add("Go");
//
//        String searchElement = "Lisp";
//
//        if (list.contains(searchElement)) {
//            System.out.println("Элемент найден");
//        } else {
//            System.out.println("Элемент не найден");
//        }

        // Алгоритм линейный поиск
//        String result = "Элемент не найден";
//        for (String element : list) {
//            if (element.equals(searchElement)) {
//                result = "Элемент найден";
//                break;
//            }
//        }
//
//        System.out.println(result);


//        // удаление элемента по значению
//        list.remove("Go");
//        System.out.println(list);
//
//        // удаление элемента по индексу
//        String removedItem = list.remove(1); // элемент Python
//        System.out.println(removedItem);
//        System.out.println(list);
//
//        // очистка списка (удаление всех элементов)
//        if (list.isEmpty()) {
//            System.out.println("Список пуст");
//        }
//        list.clear();
//        if (list.isEmpty()) {
//            System.out.println("Список пуст");
//        }

    }
}
