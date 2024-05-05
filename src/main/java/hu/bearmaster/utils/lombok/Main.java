package hu.bearmaster.utils.lombok;

import java.time.LocalDate;

import static hu.bearmaster.utils.lombok.MyUtils.NAME;

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

        HighlightedPost high = HighlightedPost.builder()
                .post(post)
                .highlightedUntil(LocalDate.now())
                .build();

        high.getLikes();

        String name = NAME;

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
