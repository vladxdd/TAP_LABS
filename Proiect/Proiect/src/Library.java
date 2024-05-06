import java.util.ArrayList;
import java.util.List;

public class Library {
  public static void main(String[] args) {
    List<Book> books = new ArrayList<>();
    Roman novel = new Roman("The Magic Mountain", 720);
    novel.addAuthor("Thomas Mann");
    books.add(novel);

    Magazine magazine = new Magazine("National Geographic", 202);
    magazine.addAuthor("National Geographic Editorial Staff");
    books.add(magazine);

    for (Book book : books) {
      book.describe();
    }
  }
}