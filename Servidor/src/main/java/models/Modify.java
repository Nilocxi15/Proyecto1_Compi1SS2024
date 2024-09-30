package models;

public class Modify {
    private String oldUsername;
    private String newUsername;
    private String newPassword;
    private String date;

    public Modify(String oldUsername, String newUsername, String newPassword, String date) {
        this.oldUsername = oldUsername;
        this.newUsername = newUsername;
        this.newPassword = newPassword;
        this.date = date;
    }

    public String getOldUsername() {
        return this.oldUsername;
    }

    public String getNewUsername() {
        return this.newUsername;
    }

    public String getNewPassword() {
        return this.newPassword;
    }

    public String getDate() {
        return this.date;
    }
}
