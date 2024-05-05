package hu.bearmaster.utils.lombok;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Delegate;

import java.time.LocalDate;

@Data
@Builder
//@FieldDefaults(level = AccessLevel.PUBLIC, makeFinal = true)
public class HighlightedPost {

    @Delegate
    Post post;

    LocalDate highlightedUntil;
}
