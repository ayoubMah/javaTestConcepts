import java.util.*;

public class Main {
    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();

        List<Integer> list = Arrays.asList(1, 3, 5, 7, 9, 11, 13, 15);

        System.out.println(bs.binarySearch(list, 1));   // Expected: 0
        System.out.println(bs.binarySearch(list, 7));   // Expected: 3
        System.out.println(bs.binarySearch(list, 15));  // Expected: 7
        System.out.println(bs.binarySearch(list, 8));   // Expected: -1 (not in list)
        System.out.println(bs.binarySearch(list, 11));  // Expected: 5
    }
}
