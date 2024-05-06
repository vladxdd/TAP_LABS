public class Roman extends Book {
  private int pageNumber;

  public Roman(String title, int pageNumber) {
    super(title);
    this.pageNumber = pageNumber;
  }

  @Override
  public void describe() {
    super.describe();
    System.out.println("Number of pages: " + pageNumber);
  }
}