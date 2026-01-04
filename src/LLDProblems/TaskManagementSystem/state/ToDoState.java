package LLDProblems.TaskManagementSystem.state;

import LLDProblems.TaskManagementSystem.entities.Task;
import LLDProblems.TaskManagementSystem.enums.TaskStatus;

public class ToDoState implements TaskState{
    @Override
    public void startProgress(Task task){
        System.out.println("Task started");
        task.setState(new InProgressState());
    }
    @Override
    public void moveToDone(Task task){

    }
    @Override
    public void reOpenTask(Task task){

    }
    @Override
    public TaskStatus getStatus(){
        return TaskStatus.TODO;
    }
}
