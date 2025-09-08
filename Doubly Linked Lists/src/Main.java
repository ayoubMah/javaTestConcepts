public class Main {
    public static void main(String[] args) {

        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        // Create nodes to add
        Node<Integer> n1 = new Node<>(null, 10, null);
        Node<Integer> n2 = new Node<>(null, 5, null);
        Node<Integer> n3 = new Node<>(null, 20, null);
        Node<Integer> n4 = new Node<>(null, 25, null);

        System.out.println("Empty list: " + list);

        list.addFirst(n1);
        list.addFirst(n2);
        list.addLast(n3);
        list.addLast(n4);
        System.out.println("After adding: " + list);

        System.out.println("Removed first: " + list.removeFirst());
        System.out.println("Removed last: " + list.removeLast());
        System.out.println("List now: " + list);

        System.out.println("First element: " + list.first());
        System.out.println("Last element: " + list.last());
        System.out.println("Size: " + list.size());
    }
}