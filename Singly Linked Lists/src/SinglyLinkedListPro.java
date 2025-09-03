public class SinglyLinkedListPro<E> {
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
        return null;
    }

    public E getLast(){
        if (this.isEmpty()) return null;
        return tail.getElm();
    }

    public void addFirst(E elm){
        size ++;
    }

    public void addLast(E elm){
        NodeProMax<E> newOne = new NodeProMax<>(elm, null);
        tail = newOne;
        size++;
    }

    public E removeFirst(){
        if (isEmpty()) return null;
        return null;
    }
}
