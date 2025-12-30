package LLDProblems.StackOverFlow.Entities;

import LLDProblems.StackOverFlow.Observer.PostObserver;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Post extends Content{
    private final AtomicInteger voteCount = new AtomicInteger(0);
    private final Map<String, VoteType> voters = new ConcurrentHashMap<>();
    private final List<Comment> comments = new ArrayList<>();
    private final Set<PostObserver> observers = new HashSet<>();

    public Post(String body, User user){
        super(body, user);
        this.addObserver(user.userObserver);
    }

    public void addObserver(PostObserver observer){
        observers.add(observer);
    }

    public void removeObserver(PostObserver observer){
        observers.remove(observer);
    }

    public void notifyObservers(){
        for(PostObserver o : observers){
            o.update();
        }
    }

    public void addComment(Comment comment){
        System.out.println("Comment added");
        this.comments.add(comment);
        this.notifyObservers();
        this.addObserver(comment.author.userObserver);
    }

    public void vote(User user, VoteType voteType){
        System.out.println("updated vote count and voters list");
        this.notifyObservers();
        this.addObserver(user.userObserver);
        // add observer
    }
}
