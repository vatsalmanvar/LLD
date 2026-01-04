package LLDProblems.TaskManagementSystem;

import LLDProblems.TaskManagementSystem.entities.Task;
import LLDProblems.TaskManagementSystem.entities.User;
import LLDProblems.TaskManagementSystem.enums.TaskPriority;
import LLDProblems.TaskManagementSystem.strategy.SortByPriority;

public class TaskManagementSystemApplication {

    public static void main(String args[]){
        User user = new User("Vatsal");
        TaskManagermentSystem taskManagermentSystem = TaskManagermentSystem.getInstance();

        Task task = taskManagermentSystem.newTask(user, TaskPriority.LOW);
        taskManagermentSystem.sortTask(taskManagermentSystem.getTaskList(), new SortByPriority());

        task.startProgress();
        task.moveToDone();
        task.reOpenTask();
    }
}
