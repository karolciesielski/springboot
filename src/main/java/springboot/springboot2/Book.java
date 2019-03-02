package springboot.springboot2;

public class Book {
    private String title;
    private int price;
    private int pagesCount;
    private int bookRating;

    public Book(String title, int price, int pagesCount, int bookRating) {
        this.title = title;
        this.price = price;
        this.pagesCount = pagesCount;
        this.bookRating = bookRating;
    }

    public int getPrice() {
        return price;
    }

    public int getPagesCount() {
        return pagesCount;
    }

    public int getBookRating() {
        return bookRating;
    }
}
