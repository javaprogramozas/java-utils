package hu.bearmaster.utils.lombok;

public class Main {

    public static void main(String[] args) {
        Post post = Post.builder()
                .id(1L)
                .title("Title")
                .topic("Lombok")
                .description("Desc")
                .build();
        Post another = post.toBuilder()
                .description("Another desc")
                .build();

        System.out.println(post);
        System.out.println(post.equals(another));
        another.setDescription("D2");
        System.out.println(another);

        User user = User.builder().id(1L).username("test user").displayName("Teszt Elek").build();
        User differentUser = user.withDisplayName("Est Hajnal");
        System.out.println(user);
        System.out.println(differentUser);
    }
}
