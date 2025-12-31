package LLDProblems.StackOverFlow;

import LLDProblems.StackOverFlow.core.ReputationManager;
import LLDProblems.StackOverFlow.entities.*;

import java.util.ArrayList;
import java.util.List;

public class StackOverFlow {

    private static StackOverFlow instance;
    private final List<User> users = new ArrayList<>();
    private final List<Question> questions = new ArrayList<>();
    private final List<Answer> answers = new ArrayList<>();
    private final ReputationManager reputationManager = new ReputationManager();

    private StackOverFlow(){

    }

    public static StackOverFlow getInstance(){
        if(instance == null) instance = new StackOverFlow();
        return instance;
    }

    public static Question postQuestion(User user, String content){
        //adding the question in array
        return new Question(content, user);
    }

    public static void addTage(Question question, Tag tag){
        question.addTag(tag);
    }

    public static Answer postAnswer(User user, Question question, String content){
        //adding in array
        Answer answer = new Answer(content, user);
        question.addAnswer(answer);
        return answer;
    }

    public static Comment addComment(Post post, User user, String body){
        Comment com =  new Comment(body, user);
        post.addComment(com);
        return com;
    }

    public void addVote(Post post, User user, VoteType voteType){
        post.vote(user, voteType);
    }

}


/*

Design and implement a simplified StackOverflow-like Q&A platform.
The system should allow users to post questions and answers, vote on them, comment, tag questions,
and track user reputation.

User Management: Users can ask questions, answer, comment, and vote.
Questions & Answers: Users can post questions and answers. Each question can have multiple answers, and one accepted answer.
Voting: Users can upvote or downvote questions and answers. Reputation is updated accordingly.
Comments: Users can comment on both questions and answers.
Tags: Questions can be tagged for categorization.
Reputation: Users gain or lose reputation based on votes and accepted answers.
Accepted Answer: The question author can mark one answer as accepted.

Entities
Questions   -> list of answers, accepted answer, up and down vote - list of users, list of comments, list of tags here observer will fit
Answers     -> which question, vote, comment, User, list of comments
User        -> reputation, upvoted, downvoted
comments    -> comment
tag         -> tag

patterns
Singleton for one instance of stackoverflow
flyweight for creation of user
observer -> all the user will notify once there is any activity on the question or answer they are interacted with.


 */