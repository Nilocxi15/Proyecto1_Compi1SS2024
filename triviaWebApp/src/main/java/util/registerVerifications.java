package util;

public class registerVerifications {
    private boolean isRegistered = false;
    private boolean isCorrectName = false;
    private boolean isCorrectUserName = false;
    private boolean isCorrectInstitution = false;
    private boolean isCorrectPassword = false;
    private boolean isCorrectConfirmPassword = false;
    private boolean thereIsContent = false;

    public boolean isRegistered() {
        return isRegistered;
    }

    public boolean isCorrectName() {
        return isCorrectName;
    }

    public boolean isCorrectUserName() {
        return isCorrectUserName;
    }

    public boolean isCorrectInstitution() {
        return isCorrectInstitution;
    }

    public boolean isCorrectPassword() {
        return isCorrectPassword;
    }

    public boolean isCorrectConfirmPassword() {
        return isCorrectConfirmPassword;
    }

    public boolean isThereContent() {
        return thereIsContent;
    }

    public void setContentRegistration(boolean isRegistered) {
        this.isRegistered = isRegistered;
    }
}
