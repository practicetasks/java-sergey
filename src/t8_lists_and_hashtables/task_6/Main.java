package t8_lists_and_hashtables.task_6;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
//        OrdersManager ordersManager = new OrdersManager();
//
//        String maxOrderCustomerName = ordersManager.getMaxOrderCustomerName();
//        System.out.println("Самая большая сумма заказов у " + maxOrderCustomerName);
//        ordersManager.printCustomerOrders(maxOrderCustomerName);

        HashMap<String, Double> map = new HashMap<>();
        map.put("A", 123.1);
        map.put("B", 123.2);
        map.put("c", 123.2);

        HashMap<String, Double> otherMap = new HashMap<>();
        otherMap.put("B", 123.2);
        otherMap.put("D", 123.2);
        otherMap.put("E", 123.2);

        for (String key : map.keySet()) {
            otherMap.remove(key);
        }

        System.out.println(otherMap);


    }
}
