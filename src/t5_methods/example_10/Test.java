package t5_methods.example_10;

public class Test {
    public static void main(String[] args) {
        // Программа для подсчета стоимости заказа
        // с учетом применения скидки, доставки и налога


        calculateOrder("Казахстан", "Астана", "Наушники", 249_990);
        calculateOrder("Германия", "Берлин", "Ноутбуки", 819_990);
    }

    public static void calculateOrder(String country, String city, String category, double price) {
        double rateUSD = 538.58;
        double priceAfterDiscount = calculateDiscount(price, category);
        double delivery = calculateDelivery(country, city) * rateUSD;
        double tax = calculateTax(priceAfterDiscount, country, city);

        double total = priceAfterDiscount + delivery + tax;

        System.out.println("Стоимость после применения скидки: " + priceAfterDiscount);
        System.out.println("Доставка: " + delivery);
        System.out.println("Налог: " + tax);
        System.out.println("Итого: " + total);
    }

    public static double calculateTax(double price, String country, String city) {
        double taxPercent;
        if (country.equals("США")) {
            if (city.equals("Нью-Йорк")) {
                taxPercent = 0.14;
            } else if (city.equals("Лос-Анджелес")) {
                taxPercent = 0.15;
            } else {
                taxPercent = 0.12;
            }
        } else if (country.equals("Германия")) {
            if (city.equals("Берлин")) {
                taxPercent = 0.11;
            } else {
                taxPercent = 0.10;
            }
        } else if (country.equals("Казахстан")) {
            taxPercent = 0.17;
        } else {
            taxPercent = 0.13;
        }
        return price * taxPercent;
    }

    public static double calculateDelivery(String country, String city) {
        if (country.equals("США")) {
            if (city.equals("Нью-Йорк")) {
                return 0;
            } else if (city.equals("Лос-Анджелес")) {
                return 5;
            } else {
                return 7;
            }
        } else if (country.equals("Германия")) {
            if (city.equals("Мюнхен")) {
                return 12;
            } else {
                return 13;
            }
        } else if (country.equals("Казахстан")) {
            return 15;
        } else {
            return 20;
        }
    }

    public static double calculateDiscount(double price, String category) {
        if (category.equals("Наушники") || category.equals("Смартфоны")) {
            return price * 0.9;
        } else if (category.equals("Ноутбуки")) {
            return price * 0.85;
        } else {
            return price;
        }
    }
}
