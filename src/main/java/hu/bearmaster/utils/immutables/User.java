package hu.bearmaster.utils.immutables;

import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
@Value.Style(redactedMask = "***")
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

    List<String> getPosts();

    //@Value.Derived
    @Value.Lazy
    default int getNumberOfPosts() {
        System.out.println("Calculating # of posts");
        return getPosts().size();
    }

}
