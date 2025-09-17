package t6_classes_objects.arrays.example_1;

public class User {
    String login;
    int age;
    Post[] posts;

    Post findPost(String description) {
        for (int i = 0; i < posts.length; i++) {
            if (posts[i] != null && posts[i].description.equals(description)) {
                return posts[i];
            }
        }
        return null;
    }

    void removePost(String description) {
        for (int i = 0; i < posts.length; i++) {
            if (posts[i] != null && posts[i].description.equals(description)) {
                posts[i] = null;
                return;
            }
        }
        System.out.println("Нет свободного места в массиве");
    }

    void showPosts() {
        for (int i = 0; i < posts.length; i++) {
            if (posts[i] != null) {
                System.out.println(posts[i].description);
            }
        }
    }

    void addPost(Post post) {
        for (int i = 0; i < posts.length; i++) {
            if (posts[i] == null) {
                posts[i] = post;
                return;
            }
        }
        System.out.println("Нет свободного места в массиве");
    }
}
