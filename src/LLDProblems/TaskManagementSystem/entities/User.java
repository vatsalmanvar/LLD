package LLDProblems.TaskManagementSystem.entities;

import LLDProblems.TaskManagementSystem.observer.Observer;

import java.util.UUID;

public class User implements Observer {
    private String userId;
    private String name;

    public User(String name){
        this.userId = UUID.randomUUID().toString();
        this.name = name;
    }

    public String getName(){return name;}

    @Override
    public void update(Task task){
        System.out.println("User "+userId+" got notified for task:"+task.getId());
    }
}
