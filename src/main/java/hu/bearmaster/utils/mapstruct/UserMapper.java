package hu.bearmaster.utils.mapstruct;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(uses = UtilityMapper.class)
public interface UserMapper {

    @Mapping(target = "userId", source = "user.id")
    @Mapping(target = "postTitles", source = "user.posts")
    @Mapping(target = "numberOfPosts", ignore = true)
    UserVo mapToUserVo(UserDto user, String email);

    UserDto mapToUserDto(UserVo user);

    default String mapPostToTitle(PostDto post) {
        return post.getTitle();
    }

    @AfterMapping
    default void setNumberOfPosts(UserDto user, @MappingTarget UserVo.UserVoBuilder userVoBuilder) {
        userVoBuilder.numberOfPosts(user.getPosts().size());
    }
}
