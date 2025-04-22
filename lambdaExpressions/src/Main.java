import java.util.Comparator;
import java.lang.Runnable;



public class Main {
    public static void main(String[] args) {
        Appel a1 = new Appel("red" , 160);
        Appel a2 = new Appel("green" , 180);

        // with anonymous class
//        Comparator<Appel> byWeight = new Comparator<Appel>() {
//            @Override
//            public int compare(Appel a1, Appel a2) {
//                return a1.getWeight().compareTo(a2.getWeight());
//            }
//        };

        // with lambda function
        Comparator<Appel> byWeight = (Appel a3 , Appel a4) ->  a1.getWeight().compareTo(a2.getWeight());


        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello Abstract classes");
            }
        };

        Runnable r2 = () -> System.out.println("Hello Lambda function");

        process(r1);
        process(r2);
        process(() -> System.out.println("Hello Lambda2"));

    }
    public static void process(Runnable r){
        r.run();
    }


}