package hu.bearmaster.utils.immutables.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

@JsonDeserialize(builder = User.Builder.class)
@Value.Immutable
public interface User {

    long getId();

    //@Nullable
    String getUsername();

    @Value.Redacted
    Optional<String> getDisplayName();

    boolean isActive();

    @Value.Default
    default Role getRole() {
        return Role.USER;
    }

    Set<String> getPosts();

    Map<String, Integer> getTopics();

    //@Value.Derived
    @Value.Lazy
    @JsonIgnore
    default int getNumberOfPosts() {
        System.out.println("Calculating # of posts");
        return getPosts().size();
    }

    static Builder builder() {
        return new Builder();
    }

    class Builder extends ImmutableUser.Builder {}
}
