public class NodeProMax<E> {
    private E data;
    private NodeProMax<E> next;

    public NodeProMax(E elm, NodeProMax<E> n){
        this.data = elm;
        this.next = n;
    }
    public E getElm(){
        return data;
    }
    public void setElm(E elm){
        this.data = elm;
    }
    public NodeProMax<E> getNext(){
        return next;
    }
    public void setNext(NodeProMax<E> nex){
        this.next = nex;
    }

}