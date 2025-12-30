package LLDProblems.StackOverFlow.Entities;

public class Answer extends Post{
    public boolean isAccepted = false;

    public Answer(String body, User user){
        super(body, user);
    }


}
