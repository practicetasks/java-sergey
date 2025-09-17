package t6_classes_objects.example_5;

public class Song {
    String name;
    int duration;
    String genre;
    Performer performer;

    void display() {
        System.out.println("Название песни: " + name);
        System.out.println("Продолжительность: " + duration);
        System.out.println("Жанр: " + genre);
        if (performer != null) {
            System.out.println("Исполнитель: " + performer.name);
        } else {
            System.out.println("Исполнитель: отсутствует");
        }
        System.out.println();
    }
}
