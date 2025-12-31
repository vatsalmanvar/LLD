package LLDProblems.StackOverFlow.strategy;

import LLDProblems.StackOverFlow.entities.Question;

import java.util.List;

public interface SearchStrategy {
    List<Question> find(List<Question> questions);
}
