package hu.bearmaster.utils.mapstruct;

import hu.bearmaster.utils.immutables.model.Role;
import org.mapstruct.factory.Mappers;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        UserDto userDto = new UserDto(1L, "testuser", Role.USER);
        PostDto postDto = new PostDto(1L, "Test post", "This a description!");
        userDto.setPosts(List.of(postDto));

        UserMapper mapper = Mappers.getMapper(UserMapper.class);

        UserVo userVo = mapper.mapToUserVo(userDto, "user@mail.com");

        System.out.println(userVo);

        UserDto userDtoAgain = mapper.mapToUserDto(userVo);

        System.out.println(userDtoAgain);
    }
}
