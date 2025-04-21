// the Book class has one responsibility it is Data holding

package applayingSRP;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Book {
    private String title;
    private String author;

    List<violitingSRP.Book> database = new ArrayList<>();

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

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
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
