import java.math.*;
import java.util.List;

public class BinarySearch {
  // the binary search method take 2 params => list and an item
  // and return the index of this item
  public int binarySearch(List<Integer> list , int target){ // we suppose that our list is sorted
    int low = 0;
    int high = list.size() -1;


    while(low <= high){
      int midIndex = (low + high) / 2 ;
      int guess = list.get(midIndex);

      if(target == guess){
        return midIndex;

      }else if(target > guess){
        low = midIndex + 1 ;
      }else{
        high = midIndex - 1;
      }

    }
    return -1; // not exist
  }

}