package Gun28._03_Ornek;

public class Book {
    String name;

    int publishYear;

    String author;

    public Book(String name, int publishYear, String author) {
        this.name = name;
        this.publishYear = publishYear;
        this.author = author;
    }

    public Book() {
    }

    public Book(String name, int publishYear) {
        this.name = name;
        this.publishYear = publishYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + this.name + '\'' +
                ", publishYear=" + this.publishYear +
                ", author='" + this.author + '\'' +
                '}';
    }
}
