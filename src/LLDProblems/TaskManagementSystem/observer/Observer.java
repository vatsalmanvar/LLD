package LLDProblems.TaskManagementSystem.observer;

import LLDProblems.TaskManagementSystem.entities.Task;

public interface Observer {
    void update(Task task);
}
