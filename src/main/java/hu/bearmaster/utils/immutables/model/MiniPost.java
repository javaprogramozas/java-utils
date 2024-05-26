package hu.bearmaster.utils.immutables.model;

import org.immutables.value.Value;

@Value.Immutable
@Value.Style(of = "new")
public interface MiniPost {

    @Value.Parameter(order = 2)
    String getTitle();

    @Value.Parameter(order = 1)
    int getLikes();

}
