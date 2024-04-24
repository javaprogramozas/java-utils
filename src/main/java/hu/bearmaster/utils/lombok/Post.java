package hu.bearmaster.utils.lombok;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.ZonedDateTime;

@Getter
@Setter
//@NoArgsConstructor
@RequiredArgsConstructor(staticName = "post")
@AllArgsConstructor
@ToString(onlyExplicitlyIncluded = true)
@EqualsAndHashCode
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
