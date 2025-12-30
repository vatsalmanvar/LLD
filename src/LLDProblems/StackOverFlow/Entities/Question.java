package LLDProblems.StackOverFlow.Entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Question extends Post{
    public final List<Answer> answers = new ArrayList<>();
    public Answer acceptedAnswer;
    public Set<Tag> tags;

    public Question(String body, User user){
        super(body, user);
    }

    public void addAnswer(Answer answer){
        answers.add(answer);
        System.out.println("Answer added to the question");
    }

    public void addTag(Tag tag){
        //add tag
        System.out.println("Tag added");
    }
}
