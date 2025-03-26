import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


public class Main {

    public static <T> List<T> filter( List<T> list , Predicate<T> condition) {
        List<T> filtedList = new ArrayList<>() ;

        for(T elm : list) {
            if (condition.test(elm)){ // if the element satisfied the condition

                filtedList.add(elm);

            }
        }
        return filtedList ;
    }

    public static void main(String[] args) {
        List<Apple> inventory = new ArrayList<>();

        inventory.add(new Apple("green"));
        inventory.add(new Apple("red"));
        inventory.add(new Apple("red"));
        inventory.add(new Apple("green"));
        inventory.add(new Apple("yellow"));
        inventory.add(new Apple("red"));


        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println(numbers);

        List<Apple> redApples = filter(inventory , (Apple appel) -> "red".equals(appel.getColor()) ) ;

        List<Apple> greenApples = filter(inventory , (Apple appel) -> "green".equals(appel.getColor())) ;

        List<Integer> evenNunbers = filter(numbers , (Integer num) -> num % 2 == 0) ;

        System.out.println("Inventory: " + inventory);
        System.out.println("Red Apples: " + redApples);
        System.out.println("Green Apples: " + greenApples);
        System.out.println("Numbers: " + numbers);
        System.out.println("Even Numbers: " + evenNunbers);

    }
}