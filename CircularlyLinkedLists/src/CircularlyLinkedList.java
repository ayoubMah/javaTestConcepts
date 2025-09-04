public class CircularlyLinkedList<E> {

    private Node<E> tail = null;
    private int size = 0;

    public CircularlyLinkedList(){}

    public boolean isEmpty(){
        return size == 0;
    }

    public E getFirst(){
        if (this.isEmpty()) return null;
        return tail.getNext().getElm();
    }

    public E getLast(){
        if (this.isEmpty()) return null;
        return tail.getElm();
    }

    public void rotate(){
        if (size != 0){
            tail = tail.getNext();
        }
    }

    public void addFirst(E elm){
        if (size == 0){
            tail = new Node<>(elm, null);
            tail.setNext(tail);
        }else {
            Node<E> headNode = tail.getNext();
            Node<E> newest = new Node<>(elm, headNode);
            tail.setNext(newest);
        }
        size++;
    }

    public void addLast(E elm){
        addFirst(elm);
        tail = tail.getNext();
    }


    @Override
    public String toString() {
        if (isEmpty()) return "()";

        StringBuilder sb = new StringBuilder();
        Node<E> current = tail.getNext();   // start at head
        do {
            sb.append("(").append(current.getElm()).append(")");
            current = current.getNext();
            if (current != tail.getNext()) {   // not back at head yet
                sb.append(" => ");
            }
        } while (current != tail.getNext());  // stop once we circle back

        return sb.toString();
    }



}
