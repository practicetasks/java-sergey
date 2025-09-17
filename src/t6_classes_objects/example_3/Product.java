package t6_classes_objects.example_3;

public class Product {
    String name;
    double price;

    void compareTo(Product otherProduct) {
        if (price > otherProduct.price) {
            System.out.println(name + " дороже чем " + otherProduct.name);
        } else if (price < otherProduct.price) {
            System.out.println(name + " дешевле чем " + otherProduct.name);
        } else {
            System.out.println(name + " и " + otherProduct.name + " имеют одинаковую стоимость");
        }
    }
}
