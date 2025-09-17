package t8_lists_and_hashtables.example_7;

import java.util.ArrayList;

public class User {
    String login;
    int age;
    ArrayList<Post> posts;

    User(String newLogin, int newAge) {
        login = newLogin;
        age = newAge;
        posts = new ArrayList<>();
    }

    void addPost(Post post) {
        posts.add(post);
    }

    void showPosts() {
        for (Post post : posts) {
            System.out.println(post.description + " — " + post.likesCount + " likes");
        }
    }

}
