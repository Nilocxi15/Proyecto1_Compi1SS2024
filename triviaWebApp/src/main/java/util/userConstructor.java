package util;

public class userConstructor {
    private String username;
    private String password;
    private String name;
    private String institution;

    public userConstructor(String username, String password, String name, String institution) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.institution = institution;
    }

    @Override
    public String toString() {
        return "\t{\n" +
                "\t\t\"USUARIO\": \"" + username + "\",\n" +
                "\t\t\"PASSWORD\": \"" + password + "\",\n" +
                "\t\t\"NOMBRE\": \"" + name + "\",\n" +
                "\t\t\"INSTITUCION\": \"" + institution + "\",\n" +
                "\t}";
    }
}
