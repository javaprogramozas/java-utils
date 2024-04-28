package hu.bearmaster.utils.lombok;

import lombok.Builder;
import lombok.Value;
import lombok.With;

@Value(staticConstructor = "user")
@Builder
public class User {

    Long id;

    String username;

    @With
    String displayName;

}
