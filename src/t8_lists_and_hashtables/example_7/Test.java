package t8_lists_and_hashtables.example_7;

public class Test {
    public static void main(String[] args) {
        User user = new User("bob", 23);
        user.addPost(new Post("Hello world by bob"));
        user.addPost(new Post("Hello world #2 by bob"));
        user.showPosts();

        User user2 = new User("tom", 23);
        user2.addPost(new Post("Hello world by tom"));
        user2.addPost(new Post("Hello world #2 by tom"));
        user2.showPosts();

    }
}


