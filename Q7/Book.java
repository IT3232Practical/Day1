package Q7;

public class Book extends LibApp{
    private String bookType;
    private String[] books;

    Book(String bookType,
                String[] books) {
        this.bookType = bookType;
        this.books = books;
    }

    public String getName() {
        return bookType;
    }

    public String[] getAllBook() {
        return books;
}

}
