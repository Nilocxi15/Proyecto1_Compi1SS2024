package models;

public class TError {
    private String token;
    private int line;
    private int column;
    private String type;
    private String description;

    public TError(String token, int line, int column, String type, String description) {
        this.token = token;
        this.line = line;
        this.column = column;
        this.type = type;
        this.description = description;
    }

    public String getToken() {
        return token;
    }

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "TError{" +
                "token='" + token + '\'' +
                ", line=" + line +
                ", column=" + column +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
