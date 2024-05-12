package hu.bearmaster.utils.immutables;

import org.immutables.value.Value;

@Value.Immutable
public interface User {

    long getId();

    String getUsername();

    String getDisplayName();

}
