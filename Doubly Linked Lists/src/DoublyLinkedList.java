public class DoublyLinkedList<E> {

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public DoublyLinkedList(){}

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public E first(){
        if (isEmpty() == true) return null;
        Node<E> firstOne = head.getNext();
        return firstOne.getElm();
    }

    public E last(){
        if (isEmpty() == true) return null;
        Node<E> lastOne = tail.getPrev();
        return lastOne.getElm();
    }

    public void addFirst(Node<E> elm){
        if (isEmpty() == true){
            head.setNext(elm);
            elm.setPrev(head);
            elm.setNext(tail);
            tail.setPrev(elm);
        }
        Node<E> currentFirst = head.getNext();
        head.setNext(elm);
        elm.setPrev(head);
        elm.setNext(currentFirst);
        currentFirst.setPrev(elm);

        size ++;
    }

    public void addLast(Node<E> elm){
        if (isEmpty() == true){
            tail.setPrev(elm);
            elm.setNext(tail);
            elm.setPrev(head);
            head.setNext(elm);
        }
        Node<E> currentLast = tail.getPrev();
        tail.setPrev(elm);
        elm.setNext(tail);
        elm.setPrev(currentLast);
        currentLast.setNext(elm);
        size++ ;
    }

    public E removeFirst(){
        if (isEmpty() == true) return null;
        Node<E> currentFirst = head.getNext();
        Node<E> nextFirst = currentFirst.getNext();
        head.setNext(nextFirst);
        nextFirst.setPrev(head);

        currentFirst.setNext(null);
        currentFirst.setPrev(null);
        size -- ;
        return currentFirst.getElm();
    }

    public E removeLast(){
        if (isEmpty() == true) return null;
        Node<E> currentLast = tail.getPrev();
        Node<E> nextLast = currentLast.getPrev();
        tail.setPrev(nextLast);
        nextLast.setNext(tail);

        currentLast.setNext(null);
        currentLast.setPrev(null);
        size -- ;
        return currentLast.getElm();
    }

    @Override
    public String toString() {
        if (isEmpty()) return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node<E> current = head.getNext();
        while (current != null) {
            sb.append(current.getElm());
            current = current.getNext();
            if (current != null) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
