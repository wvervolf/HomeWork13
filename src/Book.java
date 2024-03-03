import java.util.Objects;

public class Book {
    private String title;
    private int year;
    private Author author;

    @Override
    public String toString() {
        return "Название книги - " + title +
                ", Год издания - " + year +
                ", Автор - " + author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return getYear() == book.getYear() && Objects.equals(getTitle(), book.getTitle()) && Objects.equals(getAuthor(), book.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getYear(), getAuthor());
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public Author getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Book(String title, int year, Author author) {
        this.title = title;
        this.year = year;
        this.author = author;
    }
}
