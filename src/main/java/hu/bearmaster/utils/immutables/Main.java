package hu.bearmaster.utils.immutables;

import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        ImmutableUser user = ImmutableUser.builder()
                .id(1L)
                .username("test")
                .displayName("Teszt Elek")
                .addAllPosts(List.of("one"))
                .addPost("two")
                .addPosts("three", "last")
                .putTopic("IT", 3)
                .putTopic(Map.entry("Animals", 2))
                .build();

        System.out.println(user);

        ImmutableUser realCopy = ImmutableUser.builder()
                .id(2)
                .username("copy")
                .role(Role.ADMIN)
                .build();

        System.out.println(realCopy);

        System.out.println(user.getNumberOfPosts());
        System.out.println(user.getNumberOfPosts());

        ImmutableMiniPost post = new ImmutableMiniPost(5, "Mini");
        System.out.println(post);
    }
}
