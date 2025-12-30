package LLDProblems.StackOverFlow.Strategy;

import LLDProblems.StackOverFlow.Entities.Question;

import java.util.List;

public interface SearchStrategy {
    List<Question> find(List<Question> questions);
}
