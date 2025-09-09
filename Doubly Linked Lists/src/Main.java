public class Main {
    public static void main(String[] args) {

            DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

            System.out.println("Empty: " + list);

            list.addFirst(10);
            list.addFirst(5);
            list.addLast(20);
            list.addLast(25);
            System.out.println("After adding: " + list); // [5, 10, 20, 25]

            System.out.println("First removed: " + list.removeFirst()); // 5
            System.out.println("Last removed: " + list.removeLast());   // 25
            System.out.println("Now: " + list); // [10, 20]

            System.out.println("First element: " + list.first()); // 10
            System.out.println("Last element: " + list.last());   // 20
            System.out.println("Size: " + list.size());           // 2
    }
}