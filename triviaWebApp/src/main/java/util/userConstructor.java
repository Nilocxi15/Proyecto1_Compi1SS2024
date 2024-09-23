package util;

public class userConstructor {
    private String username;
    private String password;
    private String name;
    private String institution;
    private String date;

    public userConstructor(String username, String password, String name, String institution, String date) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.institution = institution;
        this.date = date;
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
