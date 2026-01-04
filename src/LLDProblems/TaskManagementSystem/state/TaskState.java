package LLDProblems.TaskManagementSystem.state;

import LLDProblems.TaskManagementSystem.entities.Task;
import LLDProblems.TaskManagementSystem.enums.TaskStatus;

public interface TaskState {
    void startProgress(Task task);
    void moveToDone(Task task);
    void reOpenTask(Task task);
    TaskStatus getStatus();
}
