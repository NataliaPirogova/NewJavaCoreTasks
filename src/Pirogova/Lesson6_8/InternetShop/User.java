package Pirogova.Lesson6_8.InternetShop;

public class User {
    private String login;
    private String password;
    Basket basket;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
