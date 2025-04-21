// the responsibility of this class is formating

package applayingSRP;

import java.util.List;
import java.util.stream.Collectors;

public class BookFormatter {

    public String getBookDetails(Book book){
        if (book == null) return "Invalid book data";
        return "==> "+ book.getTitle() + " by " + book.getAuthor();
    }

    public  String getDetailsBookList(List<Book> books){
        if (books == null || books.isEmpty()) return " no books to display";
        return books.stream()
                .map(this::getBookDetails)
                .collect(Collectors.joining("\n"));
    }
}