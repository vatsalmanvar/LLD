package OOPs;

public class Polymorphism {
    // Allows same method name to behave differently based on an object
    // HOW-> overloading and overriding

    //2 types
    //Compile time polymorphism - Overloading
    public static class OverloadingPolymorphism {
        public int sum(int a, int b){
            System.out.println("(int) Sum of a and b is " + (a + b));
            return a+b;
        }
        public double sum(double a, double b){
            System.out.println("(double) Sum of a and b is " + (a + b));
            return a+b;
        }
    }

    //Runtime polymorphism - overriding
    public static class OverridingPolymorphism{
        public static class Animal{
            public void makeSound(){
                System.out.println("Animal Sound");
            }
        }

        public static class Cat extends Animal{
            @Override
            public void makeSound(){
                System.out.println("Cat Sound - meow");
            }
        }
    }

    public static void execute(){
        OverloadingPolymorphism overload = new OverloadingPolymorphism();
        overload.sum(1, 2);
        overload.sum(3.5, 4.1);

        OverridingPolymorphism.Animal animal1 = new OverridingPolymorphism.Animal();
        animal1.makeSound(); // "Animal Sound"

        OverridingPolymorphism.Cat animal2 = new OverridingPolymorphism.Cat();
        animal2.makeSound(); // "Cat Sound - meow"
    }

}
