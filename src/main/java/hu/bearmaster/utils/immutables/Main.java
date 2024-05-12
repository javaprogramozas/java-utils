package hu.bearmaster.utils.immutables;

public class Main {

    public static void main(String[] args) {
        ImmutableUser user = ImmutableUser.builder()
                .id(1L)
                .username("test")
                .displayName("Teszt Elek")
                .build();

        System.out.println(user);

        ImmutableUser realCopy = ImmutableUser.builder()
                .from(user)
                .id(2)
                .build();

        System.out.println(realCopy);
    }
}
