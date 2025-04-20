package violitingSRP;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private String author;

    List<Book> database = new ArrayList<>();

    public Book(String title , String author){
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    // formating responsibility
    public String getDisplayDetails(){
        return title + " by : " + author;
    }
}
