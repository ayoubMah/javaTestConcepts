public class DoublyLinkedList<E> {

    private Node<E> head ;
    private Node<E> tail ;
    private int size = 0;

    public DoublyLinkedList(){
        head = new Node(null,null,null);
        tail = new Node(head,null,null);
        head.setNext(tail);
    }

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
    
    public void addBetween(Node<E> precedore , E elm , Node<E> successor){
        Node<E> newest = new Node<>(precedore, elm , successor);
        precedore.setNext(newest);
        successor.setPrev(newest);

        size++ ;
    }

    public void addFirst(E elm){
        addBetween(head , elm , head.getNext());
    }

    public void addLast(E elm){
        addBetween(tail.getPrev() , elm , tail);
    }

    // remove method => remove the node and return the elm of this node
    public E remove(Node<E> node){
        Node<E> thePrev = node.getPrev();
        Node<E> theNext = node.getNext();
        
        thePrev.setNext(theNext);
        theNext.setPrev(thePrev);

        // this will help the GC
        node.setNext(null);
        node.setPrev(null);
        
        size -- ;
        return node.getElm();
    }

    public E removeFirst(){
        if (isEmpty() == true) return null;
        E result = remove(head.getNext());
        return result;
    }

    public E removeLast(){
        if (isEmpty() == true) return null;
        E result = remove(tail.getPrev());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node<E> current = head.getNext();
        while (current != tail) {
            sb.append(current.getElm());
            current = current.getNext();
            if (current != tail) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

}
