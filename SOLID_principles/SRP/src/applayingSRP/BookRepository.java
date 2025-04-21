// the responsibility of this class is the persistence

package applayingSRP;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    private List<Book> database = new ArrayList<>();
    public void save(Book book){
        if (!database.contains(book)){
            database.add(book);
            System.out.println("saved book!");
        }else {
            System.out.println("book already exist");
        }

    }
}
