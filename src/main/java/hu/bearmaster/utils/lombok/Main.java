package hu.bearmaster.utils.lombok;

public class Main {

    public static void main(String[] args) {
        Post post = Post.post(1L, "Test post", "Desc");
        Post another = Post.post(1L, "Another", "D2");

        System.out.println(post);
        System.out.println(post.equals(another));
        another.setDescription(null);
    }
}
