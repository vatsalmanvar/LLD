package LLDProblems.TaskManagementSystem.state;

import LLDProblems.TaskManagementSystem.entities.Task;
import LLDProblems.TaskManagementSystem.enums.TaskStatus;

public class DoneState implements TaskState{

    @Override
    public void startProgress(Task task){

    }
    @Override
    public void moveToDone(Task task){

    }
    @Override
    public void reOpenTask(Task task){
        System.out.println("Task reopened");
        task.setState(new ToDoState());
    }
    @Override
    public TaskStatus getStatus(){
        return TaskStatus.DONE;
    }
}
