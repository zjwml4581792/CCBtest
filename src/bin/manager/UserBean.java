package bin.manager;

public class UserBean {
    private int id;
    private String username;
    private String password;
    private double account;

    public UserBean ( int id, String username, String password, double account ) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.account = account;
    }

    public int getId () {
        return id;
    }

    public void setId ( int id ) {
        this.id = id;
    }

    public String getUsername () {
        return username;
    }

    public void setUsername ( String username ) {
        this.username = username;
    }

    public String getPassword () {
        return password;
    }

    public void setPassword ( String password ) {
        this.password = password;
    }

    public double getAccount () {
        return account;
    }

    public void setAccount ( double account ) {
        this.account = account;
    }
}
