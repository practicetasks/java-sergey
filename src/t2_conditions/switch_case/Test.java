package t2_conditions.switch_case;

public class Test {
    public static void main(String[] args) {

        // тернарный оператор

        String payment = "card";
        System.out.println(payment.equals("cash") ? "Наличными" : "Картой");


        int age = 16;
        if (age >= 18) {
            System.out.println("Вы совершеннолетний");
        } else {
            System.out.println("Вы не совершеннолетний");
        }



//        if (payment.equals("cash")) {
//            System.out.println("Наличными");
//        } else {
//            System.out.println("Картой");
//        }



//        String lighting = "yellow";
//        switch (lighting) {
//            case "red" -> System.out.println("СТОП");
//            case "yellow" -> System.out.println("Притормозите");
//            case "green" -> System.out.println("Можно ехать");
//        }

//        if (lighting.equals("red")) {
//            System.out.println("СТОП");
//        } else if (lighting.equals("yellow")) {
//            System.out.println("Притормозите");
//        } else if (lighting.equals("green")) {
//            System.out.println("Газ");
//        }
    }
}
