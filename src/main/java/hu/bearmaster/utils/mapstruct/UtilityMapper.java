package hu.bearmaster.utils.mapstruct;

import org.mapstruct.Mapper;

import java.util.Optional;

@Mapper
public interface UtilityMapper {

    default <T> T mapOptional(Optional<T> optionalValue) {
        return optionalValue.orElse(null);
    }
}
