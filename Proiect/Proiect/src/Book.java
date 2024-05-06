import java.util.ArrayList;
import java.util.List;

public class Book {
  private String title;
  private List<String> authors;

  public Book(String title) {
    this.title = title;
    this.authors = new ArrayList<>();
  }

  public Book(String title, List<String> authors) {
    this.title = title;
    this.authors = authors;
  }

  public void addAuthor(String author) {
    authors.add(author);
  }

  public List<String> getAuthors() {
    return authors;
  }

  public void describe() {
    System.out.println("The book '" + title + "' written by " + authors.toString());
  }

  public String getTitle() {
    return title;
  }
}