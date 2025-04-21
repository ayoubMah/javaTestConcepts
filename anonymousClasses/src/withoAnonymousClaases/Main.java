package withoAnonymousClaases;

public class Main {
    public static void main(String[] args) {
        GreeterService greeterService = new GreeterService();

        String name = "Mahjouby" ;

        Greeter formalGreeter = new Greeter() {
            @Override
            public void greet(String name){
                System.out.println("Good day Mr " + name );
            }
        };

        greeterService.performGreeting(name , formalGreeter);

        Greeter casualGreeter = new Greeter() {
            @Override
            public void greet(String name) {
                System.out.println("A Yoo what's up" + name);
            }
        };

        greeterService.performGreeting(name , casualGreeter);

    }

}
