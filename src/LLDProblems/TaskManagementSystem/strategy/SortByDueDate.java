package LLDProblems.TaskManagementSystem.strategy;

import LLDProblems.TaskManagementSystem.entities.Task;

import java.util.List;

public class SortByDueDate implements SortStrategy{

    @Override
    public void sort(List<Task> tasks){
        System.out.println("sorted by due date");
    }
}
