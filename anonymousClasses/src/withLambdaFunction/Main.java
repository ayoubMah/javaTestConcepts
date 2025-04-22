package withLambdaFunction;


public class Main {
    public static void main(String[] args) {
        GreeterService greeterService = new GreeterService();

        String namee = "AyoubMah";

        Greeter formalGreeter = (name) -> System.out.println("Good Day Mr " + namee);

        greeterService.performGreeting(namee , formalGreeter);

        Greeter casusalGreeter = (name) -> System.out.println("Yoo what's up " + namee);

        greeterService.performGreeting(namee , casusalGreeter);


    }
}
