package hu.bearmaster.utils.immutables;

import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        ImmutableUser user = ImmutableUser.builder()
                .id(1L)
                .username("test")
                .displayName("Teszt Elek")
                .posts(List.of("one", "two"))
                .build();

        System.out.println(user);

        ImmutableUser realCopy = ImmutableUser.builder()
                .from(user)
                .id(2)
                .role(Role.ADMIN)
                .displayName(Optional.empty())
                .build();

        System.out.println(realCopy);

        System.out.println(user.getNumberOfPosts());
        System.out.println(user.getNumberOfPosts());
    }
}
