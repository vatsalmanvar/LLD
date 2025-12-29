package LLDPatterns.Singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton(){
        System.out.println("Creating instance for the first time");
    }

    public static Singleton getInstance(){
        if(instance == null){
            return instance = new Singleton();
        }
        System.out.println("Reusing the same instace");
        return instance;
    }

    public static void execute(){
        Singleton obj = Singleton.getInstance();
        obj = Singleton.getInstance();
    }
}
