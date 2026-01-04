package LLDProblems.TaskManagementSystem.entities;

import java.util.Date;
import java.util.UUID;

public class Comment {
    private String id;
    private String content;
    private User author;
    private Date timestamp;

    public Comment(User author, String content){
        this.author = author;
        this.content = content;
        this.id = UUID.randomUUID().toString();
        this.timestamp = new Date();
    }

    public User getAuthor(){return author;}
}

