package hu.bearmaster.utils.mapstruct;

import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {

    UserVo mapToUserVo(UserDto user);

    UserDto mapToUserDto(UserVo user);
}
