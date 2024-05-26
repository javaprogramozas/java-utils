package hu.bearmaster.utils.immutables;

import hu.bearmaster.utils.immutables.model.ImmutableMiniPost;
import hu.bearmaster.utils.immutables.model.Role;
import hu.bearmaster.utils.immutables.model.User;

import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        User user = User.builder()
                .id(1L)
                .username("test")
                .displayName("Teszt Elek")
                .addAllPosts(List.of("one"))
                .addPost("two")
                .addPosts("three", "last")
                .putTopic("IT", 3)
                .putTopic(Map.entry("Animals", 2))
                .active(true)
                .build();

        System.out.println(user);

        User realCopy = User.builder()
                .id(2)
                .username("copy")
                .role(Role.ADMIN)
                .active(false)
                .build();

        System.out.println(realCopy);

        System.out.println(user.getNumberOfPosts());
        System.out.println(user.getNumberOfPosts());

        ImmutableMiniPost post = new ImmutableMiniPost(5, "Mini");
        System.out.println(post);
    }
}
