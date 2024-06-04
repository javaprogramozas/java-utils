package hu.bearmaster.utils.mapstruct;

import java.util.StringJoiner;

public class UserVo {

    private final long id;

    private final String username;

    private final String role;

    private UserVo(long id, String username, String role) {
        this.id = id;
        this.username = username;
        this.role = role;
    }

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", UserVo.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("username='" + username + "'")
                .add("role='" + role + "'")
                .toString();
    }

    public static UserVoBuilder builder() {
        return new UserVoBuilder();
    }

    public static final class UserVoBuilder {
        private long id;
        private String username;
        private String role;

        private UserVoBuilder() {
        }

        public UserVoBuilder id(long id) {
            this.id = id;
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

        public UserVo build() {
            return new UserVo(id, username, role);
        }
    }
}
