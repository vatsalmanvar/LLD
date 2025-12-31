import LLDProblems.PrakingLot.ParkingLotApplication;
import LLDPatterns.Builder.Builder;
import LLDPatterns.Factory.Factory;
import LLDPatterns.Observer.ObserverExecute;
import LLDPatterns.Singleton.Singleton;
import LLDPatterns.State.State;
import LLDPatterns.Strategy.Strategy;
import LLDProblems.StackOverFlow.StackOverFlowApplication;
import LLDProblems.Tictactoe.TicTacToeApplication;
import OOPs.Abstraction;
import OOPs.Encapsulation;
import OOPs.Inheritance;
import OOPs.Polymorphism;

void main() {

    //OOPs
    System.out.println("===============Encapsulation=================");
    Encapsulation.execute();

    System.out.println("===============Abstraction=================");
    Abstraction.execute();

    System.out.println("===============Inheritance=================");
    Inheritance.execute();

    System.out.println("===============Polymorphism=================");
    Polymorphism.execute();

    //______________________________________________________________________________________________________
    //LLDs patterns
    System.out.println("===============Singleton=================");
    Singleton.execute();

    System.out.println("===============Factory=================");
    Factory.execute();

    System.out.println("===============Strategy=================");
    Strategy.execute();

    System.out.println("===============Observer=================");
    ObserverExecute.execute();

    System.out.println("===============State=================");
    State.execute();

    System.out.println("===============Builder=================");
    Builder.execute();

    //______________________________________________________________________________________________________
    //LLDs problems
    System.out.println("===============ParkingLot=================");
    ParkingLotApplication.main(null);

    System.out.println("===============StackOverFlow=================");
    StackOverFlowApplication.main(null);

    System.out.println("===============Tic Tac Toe=================");
    TicTacToeApplication.main(null);

}
