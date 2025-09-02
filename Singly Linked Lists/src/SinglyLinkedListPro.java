public class SinglyLinkedListPro<E> {
    private NodeProMax<E> head = null;
    private NodeProMax<E> tail = null;
    private int size = 0;

    public SinglyLinkedListPro(){}

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }

    public E getFirst(){
        if (this.isEmpty()) return null;
        return head.getElm();
    }

    public E getLast(){
        if (this.isEmpty()) return null;
        return tail.getElm();
    }

    public void addFirst(E elm){
        head = new NodeProMax<>(elm, head);
        if (size == 0) tail = head;
        size ++;
    }

    public void addLast(E elm){
        NodeProMax<E> newOne = new NodeProMax<>(elm, null);
        if (size == 0) head = newOne;
        else tail.setNext(newOne);
        tail = newOne;
        size++;
    }
}
