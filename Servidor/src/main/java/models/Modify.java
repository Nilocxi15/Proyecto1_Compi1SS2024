package models;

public class Modify {
    private String oldUsername;
    private String newUsername;
    private String newPassword;
    private String date;
    private String institution;

    public Modify(String oldUsername, String newUsername, String newPassword, String newInstitution, String date) {
        this.oldUsername = oldUsername;
        this.newUsername = newUsername;
        this.newPassword = newPassword;
        this.date = date;
        this.institution = newInstitution;
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

    public String getInstitution() {
        return this.institution;
    }
}
