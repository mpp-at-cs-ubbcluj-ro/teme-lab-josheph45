package ro.mpp2025.domain;

public class User extends Entity<Long> {
    private final String username;
    private final String password;

    public User(Long id, String username, String password) {
        setId(id);
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}