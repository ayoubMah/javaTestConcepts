package withoOutAnonymousClaases;

public class Main {
    public static void main(String[] args) {
        GreeterService greeterService = new GreeterService();

        String name = "Ayoub" ;

        Greeter formal = new FormalGreeter();

        greeterService.performGreeting(name, formal);

        Greeter casual = new CasualGreeter();

        greeterService.performGreeting(name, casual);
    }

}
