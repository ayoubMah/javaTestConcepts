public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Pair<String,String> p1 = new Pair<>("Hello","World");
        Pair<String,String> p2 = new Pair<>("Hello","World");

       Pair<String,String> p3 = new Pair<>("Hello","World");
       Pair<String,String> p4 = new Pair<>("Hello","this");
        Util util1 = new Util();
        Util util2 = new Util();
        System.out.println(util1.compare(p1,p2));
        System.out.println(util2.compare(p3,p4));
    }
}