package LLDProblems.StackOverFlow.Strategy;

import LLDProblems.StackOverFlow.Entities.Question;
import LLDProblems.StackOverFlow.Entities.User;

import java.util.ArrayList;
import java.util.List;

public class TagBasedSearchStrategy implements SearchStrategy{
    public List<Question> find(List<Question> questions){
        List<Question> res = new ArrayList<>();
        res.add(new Question("Question1", new User("User1")));
        return res;
    }
}
