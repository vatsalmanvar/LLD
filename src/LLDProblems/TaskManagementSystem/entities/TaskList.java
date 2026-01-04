package LLDProblems.TaskManagementSystem.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TaskList {

    private String id;
    private String name;
    private List<Task> tasks = new ArrayList<>();

    public TaskList(String name){
        this.id = UUID.randomUUID().toString();
        this.name = name;
    }

    public void addTask(Task task){
        tasks.add(task);
    }

    public List<Task> getTasks(){return tasks;}


}
