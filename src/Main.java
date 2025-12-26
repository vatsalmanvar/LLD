import LLDpatterns.Factory.Factory;
import LLDpatterns.Singleton.Singleton;
import LLDpatterns.Strategy.Strategy;
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

    //LLDs patterns
    System.out.println("===============Singleton=================");
    Singleton.execute();

    System.out.println("===============Factory=================");
    Factory.execute();

    System.out.println("===============Strategy=================");
    Strategy.execute();
}
