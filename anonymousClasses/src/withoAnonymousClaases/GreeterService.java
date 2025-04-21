package withoAnonymousClaases;

public class GreeterService{
    public void performGreeting(String name , Greeter greeter){
        System.out.println("Greeter Service say : ");
        greeter.greet(name);
    }
}
