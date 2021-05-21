package dev.brown.Book.models;

public class BookDTO {

    private int bookId;
    private String title;
    private String author;
    private int condition;

    BookDTO(){}

    public BookDTO(int bookId, String title, String author, int condition) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.condition = condition;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }
}
