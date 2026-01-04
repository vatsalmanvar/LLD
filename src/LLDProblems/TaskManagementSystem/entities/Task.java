package LLDProblems.TaskManagementSystem.entities;

import LLDProblems.TaskManagementSystem.enums.TaskPriority;
import LLDProblems.TaskManagementSystem.enums.TaskStatus;
import LLDProblems.TaskManagementSystem.observer.Observer;
import LLDProblems.TaskManagementSystem.state.TaskState;
import LLDProblems.TaskManagementSystem.state.ToDoState;

import java.util.List;
import java.util.UUID;

public class Task {
    private String id;
    private User assignedUser;
    private TaskPriority priority;
    private TaskStatus status;
    private TaskState currentState;
    private List<Observer> observers;

    public Task(TaskBuilder taskBuilder){
        this.id = UUID.randomUUID().toString();
        this.assignedUser =  taskBuilder.assignedUser;
        this.priority = taskBuilder.priority;
        this.status = taskBuilder.status;
        this.observers = List.of(taskBuilder.assignedUser);
        this.currentState = new ToDoState();
    }

    public void addObserver(User user){
        observers.add(user);
    }
    public void removeObserver(User user){
        observers.remove(user);
    }
    public void notifyObservers(){
        for(Observer ob : observers) ob.update(this);
    }

    public void startProgress(){
        currentState.startProgress(this);
        this.notifyObservers();
    }
    public void moveToDone(){
        currentState.moveToDone(this);
        this.notifyObservers();
    }
    public void reOpenTask(){
        currentState.reOpenTask(this);
        this.notifyObservers();
    }
    public TaskStatus getStatus(){
        return status;
    }

    public void assignTask(User user){
        this.assignedUser = user;
        this.addObserver(user);
    }

    public void setState(TaskState newState){
        this.currentState = newState;
        this.status = currentState.getStatus();
    }

    public String getId(){return id;}


    public static class TaskBuilder{
        private User assignedUser;
        private TaskPriority priority;
        private TaskStatus status;
        private TaskState currentState;
        private List<Observer> observers;

        public TaskBuilder setAssignedUser(User user){
            this.assignedUser = user;
            return this;
        }
        public TaskBuilder setPriority(TaskPriority priority){
            this.priority = priority;
            return this;
        }
        public TaskBuilder setStatus(TaskStatus status){
            this.status = status;
            return this;
        }
        public TaskBuilder setObservers(List<Observer> observers){
            this.observers = observers;
            return this;
        }

        public Task build(){
            return new Task(this);
        }
    }
}
