package LLDProblems.TaskManagementSystem.state;

import LLDProblems.TaskManagementSystem.entities.Task;
import LLDProblems.TaskManagementSystem.enums.TaskStatus;

public class InProgressState implements TaskState{

    @Override
    public void startProgress(Task task){

    }
    @Override
    public void moveToDone(Task task){
        System.out.println("Task is done");
        task.setState(new DoneState());
    }
    @Override
    public void reOpenTask(Task task){

    }
    @Override
    public TaskStatus getStatus(){
        return TaskStatus.IN_PROGRESS;
    }
}
