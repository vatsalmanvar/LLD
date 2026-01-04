package LLDProblems.TaskManagementSystem.strategy;

import LLDProblems.TaskManagementSystem.entities.Task;

import java.util.List;

public interface SortStrategy {
    void sort(List<Task> tasks);
}
