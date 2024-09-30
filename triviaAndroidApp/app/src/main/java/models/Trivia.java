package models;

public class Trivia {

    private String idTrivia;
    private String name;
    private String topic;
    private String questionTime;
    private String author;

    public Trivia(String idTrivia, String name, String topic, String questionTime, String author) {
        this.idTrivia = idTrivia;
        this.name = name;
        this.topic = topic;
        this.questionTime = questionTime;
        this.author = author;
    }

    public String getIdTrivia() {
        return idTrivia;
    }

    public String getName() {
        return name;
    }

    public String getQuestionTime() {
        return questionTime;
    }

    public String getTopic() {
        return topic;
    }

    public String getAuthor() {
        return author;
    }
}
