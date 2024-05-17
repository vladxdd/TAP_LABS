import java.util.LinkedList;

class Queue {
  private LinkedList<String> items;

  public Queue() {
    items = new LinkedList<>();
  }

  public void enqueue(String item) {
    items.add(item);
  }

  public String dequeue() {
    if (!isEmpty()) {
      return items.removeFirst();
    } else {
      return null;
    }
  }

  public boolean isEmpty() {
    return items.isEmpty();
  }

  public boolean isUnique(String item) {
    return items.stream().filter(i -> i.equals(item)).count() == 1;
  }
}