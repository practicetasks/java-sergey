package t6_classes_objects.example_1;

public class Test {
    public static void main(String[] args) {
        Hamster bite = new Hamster();
        bite.name = "Байт";
        bite.age = 2;
        bite.color = "Рыжий";
        bite.weight = 300;
        bite.showInfo();

        Hamster homa = new Hamster();
        homa.name = "Хома";
        homa.age = 3;
        homa.color = "Белый";
        homa.weight = 500;
        homa.showInfo();

        // TODO: Создать метод display()
        //  Название фильма: The Dark Knight
        //  Рейтинг: 9.2
        //  Год выпуска: 2009
        //  Жанр: Sci-Fi

    }
}
