public class Node<E> {
    private E elm ;
    private Node<E> next ;

    public Node (E elm , Node<E> next){
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
}
