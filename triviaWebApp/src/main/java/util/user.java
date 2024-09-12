package util;

public class user {

    private static String name = null;
    private static boolean state = false;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        user.name = name;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        user.state = state;
    }
}
