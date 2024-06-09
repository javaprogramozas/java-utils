package hu.bearmaster.utils.mapstruct;

import java.util.List;
import java.util.StringJoiner;

public class UserVo {

    private final long userId;

    private final String username;

    private final String role;

    private final String email;

    private final List<String> postTitles;

    private final int numberOfPosts;

    public UserVo(long userId, String username, String role, String email, List<String> postTitles, int numberOfPosts) {
        this.userId = userId;
        this.username = username;
        this.role = role;
        this.email = email;
        this.postTitles = postTitles;
        this.numberOfPosts = numberOfPosts;
    }

    public long getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getRole() {
        return role;
    }

    public String getEmail() {
        return email;
    }

    public List<String> getPostTitles() {
        return postTitles;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", UserVo.class.getSimpleName() + "[", "]")
                .add("userId=" + userId)
                .add("username='" + username + "'")
                .add("role='" + role + "'")
                .add("email='" + email + "'")
                .add("postTitles=" + postTitles)
                .add("numberOfPosts=" + numberOfPosts)
                .toString();
    }

    public static UserVoBuilder builder() {
        return new UserVoBuilder();
    }

    public static final class UserVoBuilder {
        private long userId;
        private String username;
        private String role;
        private String email;
        private List<String> postTitles;
        private int numberOfPosts;

        private UserVoBuilder() {
        }

        public UserVoBuilder userId(long userId) {
            this.userId = userId;
            return this;
        }

        public UserVoBuilder username(String username) {
            this.username = username;
            return this;
        }

        public UserVoBuilder role(String role) {
            this.role = role;
            return this;
        }

        public UserVoBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UserVoBuilder postTitles(List<String> postTitles) {
            this.postTitles = postTitles;
            return this;
        }

        public UserVoBuilder numberOfPosts(int numberOfPosts) {
            this.numberOfPosts = numberOfPosts;
            return this;
        }

        public UserVo build() {
            return new UserVo(userId, username, role, email, postTitles, numberOfPosts);
        }
    }
}
