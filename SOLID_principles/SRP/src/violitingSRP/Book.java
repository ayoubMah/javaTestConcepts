package violitingSRP;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    // persistence responsibility
    public void save(){
        if ( !database.contains(this)){
            database.add(this);
        }
        System.out.println("saved : " + getDisplayDetails());
    }

    public void displayAllSavedBooks(){
        if (database.isEmpty()) {
            System.out.println("our database is empty");
        }
        for (Book book : database){
            book.getDisplayDetails();
        }
        System.out.println("-------------------------------");

    }
    // why i override equals and hashcode
    /*
    cuz i search and i find that our contains that we already use it is
    dependes on the default equals
     */
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title , ((Book) o).title) && Objects.equals(author , ((Book) o).author) ;

    }

    @Override
    public int hashCode(){
        return Objects.hash(title,author);
    }
}
