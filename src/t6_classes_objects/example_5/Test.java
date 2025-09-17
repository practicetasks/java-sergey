package t6_classes_objects.example_5;

public class Test {
    public static void main(String[] args) {
        Performer queen = new Performer();
        queen.name = "Queen";
        queen.type = "Группа";
        queen.debutYear = 1975;

        Song song = new Song();
        song.name = "Bohemian Rhapsody";
        song.duration = 480;
        song.genre = "Progressive Rock";
        song.performer = queen;

        Song secondSong = new Song();
        secondSong.name = "We Will Rock You";
        secondSong.duration = 320;
        secondSong.genre = "Classic Rock";

        song.display();
        secondSong.display();
    }
}
