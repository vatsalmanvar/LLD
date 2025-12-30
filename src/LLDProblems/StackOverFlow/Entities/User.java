package LLDProblems.StackOverFlow.Entities;

import LLDProblems.StackOverFlow.Observer.UserObserver;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

public class User {
    public final String id;
    public final String name;
    public final AtomicInteger reputation = new AtomicInteger(0);
    public final UserObserver userObserver;

    public User(String name){
        this.id = UUID.randomUUID().toString();
        this.name = name;
        userObserver = new UserObserver();
    }
}
