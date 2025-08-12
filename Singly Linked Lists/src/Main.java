public class Main {
    public static void main(String[] args) {
        System.out.println("==============================");
        //Node node1 = new Node(10);
        //node1.setNext(new Node(33));
        //String s = node1.toString();
        //System.out.println(s);

        System.out.println("========================");
        SinglyLikedList sl = new SinglyLikedList(10);
        sl.addLast(new Node(9));
        System.out.println(sl.toString());
        sl.addLast(new Node(8));
        System.out.println(sl.toString());
        sl.addLast(new Node(7));
        System.out.println(sl.toString());

        sl.addFirst(new Node(33));
        System.out.println(sl.toString());
        sl.addFirst(new Node(44));
        System.out.println(sl.toString());
        sl.addFirst(new Node(77));
        System.out.println(sl.toString());
        System.out.println("==============================");
        
    }
}
