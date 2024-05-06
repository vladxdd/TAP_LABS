import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Introduceti numele lucratorului 1: ");
    String name1 = scanner.nextLine();
    System.out.print("Introduceti varsta lucratorului 1: ");
    int age1 = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Setati functia lucratorului 1: ");
    String function1 = scanner.nextLine();

    Lucratori primulLucrator = new Lucratori(name1, function1, age1);
    primulLucrator.setSalariu();
    primulLucrator.setPremiu();

    ShowInfo(primulLucrator);

    System.out.print("\nIntroduceti numele lucratorului 2: ");
    String name2 = scanner.nextLine();
    System.out.print("Introduceti varsta lucratorului 2: ");
    int age2 = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Setati functia lucratorului 2: ");
    String function2 = scanner.nextLine();

    Lucratori alDoileaLucrator = new Lucratori(name2, function2, age2);
    alDoileaLucrator.setSalariu();
    alDoileaLucrator.setPremiu();

    ShowInfo(alDoileaLucrator);
  }

  public static void ShowInfo(Lucratori lucrator) {
    System.out.println("\nInformatii despre lucrator:");
    System.out.println("Nume: " + lucrator.getName());
    System.out.println("Varsta: " + lucrator.getAge());
    System.out.println("Functie: " + lucrator.getFunction());
    System.out.println("Salariu: " + lucrator.getSalariu());
    System.out.println("Premiu: " + lucrator.getPremiu());
  }
}
