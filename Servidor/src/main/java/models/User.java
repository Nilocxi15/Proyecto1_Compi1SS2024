package models;

public class User {
    private String userName;
    private String password;
    private String name;
    private String institution;

    public User(String userName, String password, String name, String institution) {
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.institution = institution;
    }

    public String getUserName() {
        return userName;
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


}
