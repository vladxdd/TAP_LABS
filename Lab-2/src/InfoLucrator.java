import java.util.Scanner;

public class InfoLucrator {
  private int salariu, premiu;

  public InfoLucrator() {
    salariu = 1000;
    premiu = 1000;
  }

  public InfoLucrator(int salariu) {
    this.salariu = salariu;
  }

  public InfoLucrator(int salariu, int premiu) {
    this(salariu);
    this.premiu = premiu;
  }

  Scanner sc = new Scanner(System.in);
  Scanner st = new Scanner(System.in);

  public void setSalariu() {
    System.out.print("Introduceti salariu: ");
    String sure;
    int salariu = sc.nextInt();
    if (salariu < this.salariu) {
      System.out.println("Are you sure to a lower salary? Yes/No");
      sure = st.nextLine();
      if (sure.equals("Yes")) {
        if (salariu < -1) {
          System.out.println("Salary negative");
        } else {
          this.salariu = salariu;
        }
      } else {
        System.out.print("Another salary: ");
        salariu = sc.nextInt();
      }
    } else {
      this.salariu = salariu;
    }
  }

  public void setPremiu() {
    System.out.print("Introduceti premiu: ");
    int premiu = sc.nextInt();
    if (premiu < 0) {
      System.out.println("Premiu negativ");
    } else {
      this.premiu = premiu;
    }
  }

  public int getSalariu() {
    return salariu;
  }

  public int getPremiu() {
    return premiu;
  }
}
