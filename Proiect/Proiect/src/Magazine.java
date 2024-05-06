import java.io.PrintStream;

public class Magazine extends Book {
  private int editionNumber;

  public Magazine(String title, int editionNumber) {
    super(title);
    this.editionNumber = editionNumber;
  }

  @Override
  public void describe() {
    super.describe();
    System.out.println("Edition number: " + editionNumber);
  }
}