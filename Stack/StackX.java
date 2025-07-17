public class StackX {
  private int size;
  private int[] arr;
  private int top; // the index of the top elm not the elm itself

  public StackX(int max){
    arr = new int[max];
    this.size = max;
    top = -1; // no elm in this stack so there is no top elm
  }

  public void push(int elm){
    arr[++top] = elm;
  }

  public int pop(){
    return arr[top--];
  }

  public int peek(){
    return arr[top];
  }

  public boolean isEmpty(){
    return top == -1;
  }

  public boolean isFull(){
    return top == size - 1;
  }

}