package hu.bearmaster.utils.lombok;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.ToString;

import java.time.ZonedDateTime;

@Data
@ToString(onlyExplicitlyIncluded = true)
@Builder(toBuilder = true)
public class Post {

    private final Long id;

    @ToString.Include
    @EqualsAndHashCode.Exclude
    private final String title;

    @NonNull
    private String description;

    private ZonedDateTime createdOn;

    private int likes;

    private String slug;

    private String topic;

    private User author;
}
