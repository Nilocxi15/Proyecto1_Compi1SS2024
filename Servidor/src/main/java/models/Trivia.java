package models;

import java.util.LinkedList;

public class Trivia {
    private String idTrivia;
    private String name;
    private String topic;
    private String time;
    private String creationUser;
    private LinkedList<Component> componentsList = new LinkedList<>();

    public Trivia(String idTrivia, String name, String topic, String time, String creationUser, LinkedList<Component> componentsList) {
        this.idTrivia = idTrivia;
        this.name = name;
        this.topic = topic;
        this.time = time;
        this.creationUser = creationUser;
        this.componentsList = componentsList;
    }

    public String getIdTrivia() {
        return idTrivia;
    }

    public String getName() {
        return name;
    }

    public String getTopic() {
        return topic;
    }

    public String getTime() {
        return time;
    }

    public String getCreationUser() {
        return creationUser;
    }

    public LinkedList<Component> getComponentsList() {
        return componentsList;
    }
}
