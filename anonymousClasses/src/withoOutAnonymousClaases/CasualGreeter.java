package withoOutAnonymousClaases;

public class CasualGreeter implements Greeter {
    @Override
    public void greet(String name) {
        System.out.println("Yoo what's up " + name + "!");
    }
}