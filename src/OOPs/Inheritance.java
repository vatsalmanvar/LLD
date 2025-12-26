package OOPs;

public class Inheritance {
    // Means class will acquire properties and behavior of another class (IS-A relationship)

    public class Animal{
        public void eat(){
            System.out.println("Animal is eating");
        }
    }

    public class Cat extends Animal{
        public void meow(){
            System.out.println("Cat is meowing");
        }
    }

    public void execute(){
        Cat animal = new Cat();
        animal.eat();
        animal.meow();
    }

}
