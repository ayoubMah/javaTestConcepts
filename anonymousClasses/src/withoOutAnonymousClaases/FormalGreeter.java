package withoOutAnonymousClaases;

public class FormalGreeter implements Greeter{
    @Override
    public void greet(String name) {
        System.out.println("Good day " + name + ".");
    }
}


