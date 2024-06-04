package hu.bearmaster.utils.immutables;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import hu.bearmaster.utils.immutables.model.ImmutableMiniPost;
import hu.bearmaster.utils.immutables.model.Role;
import hu.bearmaster.utils.immutables.model.User;

import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws JsonProcessingException {
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

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new Jdk8Module());
        String userAsJson = objectMapper.writeValueAsString(user);
        System.out.println(userAsJson);
        User userFromJson = objectMapper.readValue(userAsJson, User.class);
        System.out.println(userFromJson);
    }
}
