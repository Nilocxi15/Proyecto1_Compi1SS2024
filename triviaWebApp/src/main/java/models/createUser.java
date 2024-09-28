package models;

public class createUser {
    private String username;
    private String password;
    private String name;
    private String institution;
    private String date;
    private boolean state;

    public createUser(String username, String password, String name, String institution, String date, boolean state) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.institution = institution;
        this.date = date;
        this.state = state;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getInstitution() {
        return institution;
    }

    public String getDate() {
        return date;
    }

    public boolean isState() {
        return state;
    }
}
