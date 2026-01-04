package LLDProblems.TaskManagementSystem;

import LLDProblems.TaskManagementSystem.entities.Task;
import LLDProblems.TaskManagementSystem.entities.TaskList;
import LLDProblems.TaskManagementSystem.entities.User;
import LLDProblems.TaskManagementSystem.enums.TaskPriority;
import LLDProblems.TaskManagementSystem.strategy.SortStrategy;

public class TaskManagermentSystem {

    private static TaskManagermentSystem instance;

    private TaskManagermentSystem(){
    }

    public static TaskManagermentSystem getInstance(){
        if(instance == null) instance = new TaskManagermentSystem();
        return instance;
    }

    private TaskList taskList = new TaskList("Sprint 1");

    public Task newTask(User author, TaskPriority priority){
        Task task =  new Task.TaskBuilder().setAssignedUser(author).setPriority(priority).build();
        taskList.addTask(task);
        return task;
    }

    public void addTask(Task task){
        taskList.addTask(task);
    }

    public void sortTask(TaskList list, SortStrategy strategy){
        strategy.sort(list.getTasks());
    }

    public TaskList getTaskList(){return taskList;}


}

/*
Problem Statement
Design and implement a Task Management System that allows users to create, assign, update, and track tasks.
The system should support task priorities, statuses, comments, and user assignment.

Requirements
Task Creation: Users can create tasks with a title, description, priority, and assignee.
Task Assignment: Tasks can be assigned to users and reassigned as needed.
Task Status: Tasks can have statuses such as TODO, IN_PROGRESS, DONE, etc.
Task Priority: Tasks can have priorities such as LOW, MEDIUM, HIGH.
Comments: Users can add comments to tasks.
Task Updates: Tasks can be updated (status, priority, assignee, etc.).
Task Listing: List all tasks, or filter by status, priority, or assignee.
Extensibility: Easy to add new statuses, priorities, or features.


Entities:
Task
User
Comment
TaskStatus - enum
TaskPriority - enum


 */