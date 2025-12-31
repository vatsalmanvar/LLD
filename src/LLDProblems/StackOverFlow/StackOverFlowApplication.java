package LLDProblems.StackOverFlow;

import LLDProblems.StackOverFlow.entities.*;

public class StackOverFlowApplication {
    public static void main(String args[]){

        StackOverFlow stackOverFlow = StackOverFlow.getInstance();

        User user1 = new User("Vatsal");
        User user2 = new User("Prajjwal");
        User user3 = new User("Yash");

        Question question = StackOverFlow.postQuestion(user1, "What is the use of Observer design pattern?");
        question.addTag(new Tag("LLD"));

        Answer answer = new Answer("Observer is very useful", user2);

        stackOverFlow.addVote(question, user3, VoteType.UPVOTE);

        question.addComment(new Comment("Comment 1", user3));
        answer.addComment(new Comment("Comment 2", user3));

    }
}
