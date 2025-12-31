package LLDProblems.StackOverFlow.strategy;

import LLDProblems.StackOverFlow.entities.Question;
import LLDProblems.StackOverFlow.entities.User;

import java.util.ArrayList;
import java.util.List;

public class KeywordSearchStrategy implements SearchStrategy{

    public List<Question> find(List<Question> questions){
        List<Question> res = new ArrayList<>();
        res.add(new Question("Question1", new User("User1")));
        return res;
    }
}
