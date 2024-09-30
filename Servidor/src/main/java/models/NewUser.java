package models;

public class NewUser {
    private String username;
    private String password;
    private String name;
    private String institution;
    private String date;

    public NewUser(String username, String password, String name, String institution, String date) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.institution = institution;
        this.date = date;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public String getName() {
        return this.name;
    }

    public String getInstitution() {
        return this.institution;
    }

    public String getDate() {
        return this.date;
    }

    @Override
    public String toString() {
        return "\t{\n" +
                "\t\t\"USUARIO\": \"" + username + "\",\n" +
                "\t\t\"PASSWORD\": \"" + password + "\",\n" +
                "\t\t\"NOMBRE\": \"" + name + "\",\n" +
                "\t\t\"INSTITUCION\": \"" + institution + "\",\n" +
                "\t\t\"FECHA_CREACION\": \"" + date + "\"\n" +
                "\t}";
    }
}
