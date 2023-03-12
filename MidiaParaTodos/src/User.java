public class User {
    String email;
    String password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String get_email() {
        return email;
    }

    public void set_email(String email) {
        this.email = email;
    }

    public String get_password() {
        return password;
    }

    public void set_password(String password) {
        this.password = password;
    }
}
