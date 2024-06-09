package hu.bearmaster.utils.mapstruct;

import hu.bearmaster.utils.immutables.model.Role;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class UserDto {

    private Long id;

    private String username;

    private Role role;

    private List<PostDto> posts = new ArrayList<>();

    public UserDto(Long id, String username, Role role) {
        this.id = id;
        this.username = username;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public List<PostDto> getPosts() {
        return posts;
    }

    public void setPosts(List<PostDto> posts) {
        this.posts = posts;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", UserDto.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("username='" + username + "'")
                .add("role=" + role)
                .add("posts=" + posts)
                .toString();
    }
}
