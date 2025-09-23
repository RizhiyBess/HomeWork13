import java.util.Objects;

public class Book {
    private final Author author;
    private String titleBook;
    private int yearPublication;

    public Book(String titleBook, Author author, int yearPublication) {
        this.titleBook = titleBook;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    public String getTitleBook() {
        return titleBook;
    }

    public String getAuthor() {
        return author.getName() + " " + author.getSurname();
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
                ", titleBook='" + titleBook + '\'' +
                ", yearPublication=" + yearPublication +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublication == book.yearPublication && Objects.equals(titleBook, book.titleBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titleBook, yearPublication);
    }
}
