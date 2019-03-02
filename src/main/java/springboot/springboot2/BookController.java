package springboot.springboot2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class BookController {

    @GetMapping("/books")
    public List<Book> bookList(int price, int bookRating, int pagesCount) {
        Book bookA = new Book("Zrób To Sam", 40, 60, 5);
        Book bookB = new Book("Kevin Sam w Domu", 70, 500, 5);
        Book bookC = new Book("Kot w Butach", 30, 300, 3);
        Book bookD = new Book("Słownik Polsko-Rosyjski", 100, 1200, 1);

        List<Book> books = new ArrayList<>();
        books.add(bookA);
        books.add(bookB);
        books.add(bookC);
        books.add(bookD);

        return books.stream().filter(b -> b.getPrice() < price).filter(b -> b.getBookRating() > bookRating).filter(b -> b.getPagesCount() > pagesCount).collect(Collectors.toCollection(ArrayList::new));
    }

}
