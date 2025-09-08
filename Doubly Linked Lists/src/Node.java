public class Node<E> {
    private E elm;
    private Node<E> next;
    private Node<E> prev;

    public Node(Node<E> prev, E elm , Node<E> next){
        this.prev = prev;
        this.elm = elm;
        this.next = next;
    }

    public E getElm() {
        return elm;
    }

    public void setElm(E elm) {
        this.elm = elm;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public Node<E> getPrev() {
        return prev;
    }

    public void setPrev(Node<E> prev) {
        this.prev = prev;
    }


}
