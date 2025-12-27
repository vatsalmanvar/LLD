package OOPs;

public class Abstraction {
    //Means Exposing what is necessary and hiding the implementation details
    //HOW-> can be done using interfaces or abstract classes

    public static class AbstractionViaInterface{
        public interface Payment{
            public void pay(double amount);
        }

        public class PaymentViaInterface implements Payment{
            public void pay(double amount){
                System.out.println("Amount is paid using the interface abstraction");
            }
        }
    }

    public static class AbstractionViaAbstractClass{
        public abstract class Vehicle{
            public abstract void start();
            public void fuel(){
                System.out.println("Fueling is completed");
            }
        }

        public class Car extends Vehicle{
            public void start(){
                System.out.println("Starting Car");
            }
        }
    }

    public static void execute(){
        // via interface
        AbstractionViaInterface abstractionViaInterface = new AbstractionViaInterface();
        AbstractionViaInterface.Payment demoClass1 = abstractionViaInterface.new PaymentViaInterface();
        demoClass1.pay(1000);

        // via abstract class
        AbstractionViaAbstractClass abstractionViaAbstractClass = new AbstractionViaAbstractClass();
        AbstractionViaAbstractClass.Vehicle demoClass2 = abstractionViaAbstractClass.new Car();
        demoClass2.start();
        demoClass2.fuel();
    }
}
