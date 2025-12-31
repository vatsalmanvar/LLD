package LLDProblems.StackOverFlow.entities;

import java.time.LocalDateTime;
import java.util.UUID;

public abstract class Content {
    public String id;
    public String body;
    public User author;
    public LocalDateTime creationTime;

    public Content(String body, User user){
        this.id = UUID.randomUUID().toString();
        this.body = body;
        this.author = user;
    }

}
