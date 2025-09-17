package t6_classes_objects.arrays.example_1;

public class Test {
    public static void main(String[] args) {

    User user = new User();
    user.login = "bob228";
    user.age = 28;
    user.posts = new Post[10];

    Post post = new Post();
    post.description = "Hello world by bbbob228";
    post.likesCount = 228;
    user.addPost(post);

    Post secondPost = new Post();
    secondPost.description = "Hello world #2 by bbbob228";
    secondPost.likesCount = 228;
    user.addPost(secondPost);

    Post foundPost = user.findPost("Hello world by bbbob228");
    System.out.println(foundPost.description);
    System.out.println(foundPost.likesCount);

    Post foundPost2 = user.findPost("other post");
    System.out.println(foundPost2);
//    user.showPosts();




//        User[] users = new User[5];
//
//        users[0] = new User();
//        users[0].login = "bob228";
//        users[0].age = 28;
//
//        users[1] = new User();
//        users[1].login = "thomas8";
//        users[1].age = 23;
//
//        users[2] = new User();
//        users[2].login = "jackD";
//        users[2].age = 29;
//
//        for (int i = 0; i < users.length; i++) {
//            if (users[i] != null) {
//                System.out.println(users[i].login);
//            }
//        }


    }
}
