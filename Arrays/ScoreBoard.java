package Arrays;

public class ScoreBoard {
  private int numEntries = 0;
  private GameEntry[] board;

  public ScoreBoard(int capacity){
    board = new GameEntry[capacity];
  }

  public void add(GameEntry elm){
    int newScore = elm.getScore();
    if(numEntries < board.length || newScore > board[numEntries - 1].getScore() ) { // if the array still not fill or score is qualifie
      if(numEntries < board.length){
        numEntries ++;
      }
      int j = numEntries -1;
      while(j > 0 && board[j - 1].getScore() < newScore){
        board[j] = board[j - 1];
        j -- ;
      }
      board[j] = elm;
    }

  }

  public GameEntry remove(int index) throws IndexOutOfBoundsException {
    if(index < 0 || index >= numEntries ) throw new IndexOutOfBoundsException("Invalid index: " + index);

    GameEntry temp = board[index];
    for(int j = index; j < numEntries; j++ ){
      board[j] = board[j + 1];
    }
    board[numEntries -1] = null;
    numEntries -- ;
    return temp;
  }

  // insertion sorting
  public void insertionSort(char[] data){
    int len = data.length;

    for(int k = 1; k < len  ; k ++ ){
      char cur = data[k];
      int j = k;
      while(j > 0 && data[j - 1] > cur){
        data[j] = data[j-1];
        j--;
      }
      data[j] = cur;

    }
  }
}
