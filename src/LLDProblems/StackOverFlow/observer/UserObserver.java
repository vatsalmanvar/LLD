package LLDProblems.StackOverFlow.observer;

public class UserObserver implements PostObserver{

    @Override
    public void update(){
        System.out.println("User notified");
    }
}
