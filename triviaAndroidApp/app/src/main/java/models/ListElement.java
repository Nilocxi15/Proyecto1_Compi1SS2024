package models;

public class ListElement {
    private String name;
    private String topic;
    private String author;
    private String time;

    public ListElement(String name, String topic, String author, String time) {
        this.name = name;
        this.topic = topic;
        this.author = author;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public String getTopic() {
        return topic;
    }

    public String getAuthor() {
        return author;
    }

    public String getTime() {
        return time;
    }
}
