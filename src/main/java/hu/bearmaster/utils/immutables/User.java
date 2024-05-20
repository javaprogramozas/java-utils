package hu.bearmaster.utils.immutables;

import org.immutables.value.Value;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

@Value.Immutable
@Value.Style(depluralize = true)
public interface User {

    long getId();

    //@Nullable
    String getUsername();

    @Value.Redacted
    Optional<String> getDisplayName();

    @Value.Default
    default Role getRole() {
        return Role.USER;
    }

    Set<String> getPosts();

    Map<String, Integer> getTopics();

    //@Value.Derived
    @Value.Lazy
    default int getNumberOfPosts() {
        System.out.println("Calculating # of posts");
        return getPosts().size();
    }

}
