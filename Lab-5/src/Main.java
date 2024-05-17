import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Queue queue = new Queue();
    Scanner scanner = new Scanner(System.in);

    System.out.println("Introduceți șiruri de caractere ('stop' pentru a opri):");
    while (true) {
      try {
        String input = scanner.nextLine();
        if (input.equals("stop")) {
          break;
        }
        if (!isString(input)) {
          throw new IllegalArgumentException("Nu este un șir de caractere!");
        }
        queue.enqueue(input);
        System.out.println("Elementul a fost adăugat cu succes în coadă.");
      } catch (IllegalArgumentException e) {
        System.out.println("Eroare: " + e.getMessage());
      }
    }

    System.out.println("Introduceți un șir pentru a verifica unicitatea:");
    String check = scanner.nextLine();
    System.out.println("Este \"" + check + "\" unic în coadă? " + queue.isUnique(check));
  }

  private static boolean isString(String input) {
    return input.matches("[a-zA-Z]+");
  }
}