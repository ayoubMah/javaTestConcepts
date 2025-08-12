public class SinglyLikedList<E>{
  private Node node;
  private Node head;
  private Node tail;
  private E first;

  // so o guess a singly linked list with one node 
  // is one node that the head and the tail in the same time put on it
  public SinglyLikedList(E first) {
    node = new Node(first);
    head = node;
    tail = node;
  } 
  
  public void addFirst(Node<E> n){
    n.setNext(head);
    head = n;
  }

  public void addLast(Node<E> last) {
    tail.setNext(last);
    tail = last;
  }



  public String toString(){
      Node current = head;
      String result = "";
      while (current.getNext() != null) {
        result += "(" + current.getData() +")";
        if (current.getNext() != null) {
          result += "=>";
        }
        current = current.getNext();
      }
      result += "(null)";
      return result;
  }

}
