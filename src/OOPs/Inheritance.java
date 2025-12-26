package OOPs;

public class Inheritance {
    // Means class will acquire properties and behavior of another class (IS-A relationship)

    public static class Animal{
        public void eat(){
            System.out.println("Animal is eating");
        }
    }

    public static class Cat extends Animal{
        public void meow(){
            System.out.println("Cat is meowing");
        }
    }

    public static void execute(){
        Cat animal = new Cat();
        animal.eat();
        animal.meow();
    }

}
