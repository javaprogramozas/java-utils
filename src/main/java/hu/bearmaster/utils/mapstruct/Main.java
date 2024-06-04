package hu.bearmaster.utils.mapstruct;

import hu.bearmaster.utils.immutables.model.Role;
import org.mapstruct.factory.Mappers;

public class Main {

    public static void main(String[] args) {
        UserDto userDto = new UserDto(1L, "testuser", Role.USER);

        UserMapper mapper = Mappers.getMapper(UserMapper.class);

        UserVo userVo = mapper.mapToUserVo(userDto);

        System.out.println(userVo);

        UserDto userDtoAgain = mapper.mapToUserDto(userVo);

        System.out.println(userDtoAgain);
    }
}
