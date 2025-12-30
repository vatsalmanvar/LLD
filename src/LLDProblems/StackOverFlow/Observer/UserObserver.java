package LLDProblems.StackOverFlow.Observer;

public class UserObserver implements PostObserver{

    @Override
    public void update(){
        System.out.println("User notified");
    }
}
