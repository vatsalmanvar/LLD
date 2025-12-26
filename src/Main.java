import OOPs.Abstraction;
import OOPs.Encapsulation;
import OOPs.Inheritance;
import OOPs.Polymorphism;

void main() {
    System.out.println("===============Encapsulation=================");
    Encapsulation encapsulation = new Encapsulation();
    encapsulation.execute();

    System.out.println("===============Abstraction=================");
    Abstraction abstraction = new Abstraction();
    abstraction.execute();

    System.out.println("===============Inheritance=================");
    Inheritance inheritance = new Inheritance();
    inheritance.execute();

    System.out.println("===============Polymorphism=================");
    Polymorphism polymorphism = new Polymorphism();
    polymorphism.execute();
}
