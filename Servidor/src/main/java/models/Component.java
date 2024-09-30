package models;

public class Component {
    private String idComponent;
    private String componentClass;
    private String lines;
    private String columns;
    private String visibleText;
    private String answer;
    private String options;

    public Component(String idComponent, String componentClass, String lines, String columns, String visibleText, String answer, String options) {
        this.idComponent = idComponent;
        this.componentClass = componentClass;
        this.lines = lines;
        this.columns = columns;
        this.visibleText = visibleText;
        this.answer = answer;
        this.options = options;
    }

    public String getIdComponent() {
        return idComponent;
    }

    public String getComponentClass() {
        return componentClass;
    }

    public String getLines() {
        return lines;
    }

    public String getColumns() {
        return columns;
    }

    public String getVisibleText() {
        return visibleText;
    }

    public String getAnswer() {
        return answer;
    }

    public String getOptions() {
        return options;
    }

    @Override
    public String toString() {
    return "Component{\n" +
            "idComponent='" + idComponent + '\'' + "\n" +
            "componentClass='" + componentClass + '\'' + "\n" +
            "lines='" + lines + '\'' + "\n" +
            "columns='" + columns + '\'' + "\n" +
            "visibleText='" + visibleText + '\'' + "\n" +
            "answer='" + answer + '\'' + "\n" +
            "options='" + options + '\'' + "\n" +
            '}';
    }
}
