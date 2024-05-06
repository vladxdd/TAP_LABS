import java.util.Scanner;

public class Inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner funct = new Scanner(System.in);
          Lucratori primul = new Lucratori();
          Lucratori cinci = new Lucratori("rf", "erfer", 124);
        System.out.print("Introduceti numele: ");
          String name = sc.nextLine();
         primul.setName(name);
        System.out.print("Introduceti virsta: ");
        int age = sc.nextInt();
         primul.setAge(age);
       System.out.print("Setati functia: ");
        String function = funct.nextLine();
          primul.setFunction(function);
          primul.setPremiu();
          primul.setSalariu();
        System.out.println("Numele este: " + primul.getName());
        System.out.println("Virsta: " + primul.getAge());
        System.out.println("functia: " + primul.getFunction());
        System.out.println("Salariu: " + primul.getSalariu());
        System.out.println("Premiu: " + primul.getPremiu());

        System.out.print("Introduceti numele: ");
        String name2 = funct.nextLine();
        System.out.print("Introduceti virsta: ");
        int age2 = sc.nextInt();
        System.out.print("Setati functia: ");
        String function2 = funct.nextLine();
        Lucratori doi = new Lucratori(name2, function2, age2);
        doi.setSalariu();
        doi.setPremiu();
        System.out.println("Numele este: " + doi.getName());
        System.out.println("Virsta: " + doi.getAge());
        System.out.println("functia: " + doi.getFunction());
        System.out.println("Salariu: " + doi.getSalariu());
        System.out.println("Premiu: " + doi.getPremiu());

        InfoLucrator trei = new InfoLucrator();
        trei.setSalariu();
        trei.setPremiu();
        System.out.println("Salariu: " + trei.getSalariu());
        System.out.println("Premiu: " + trei.getPremiu());

        System.out.print("Introduceti numele: ");
        String name4 = funct.nextLine();
        System.out.print("Introduceti virsta: ");
        int age4 = sc.nextInt();
        System.out.print("Setati functia: ");
        String function4 = funct.nextLine();
        InfoLucrator patru = new Lucratori(name4, function4, age4);
        patru.setSalariu();
        patru.setPremiu();
        System.out.println("Salariu: " + patru.getSalariu());
        System.out.println("Premiu: " + patru.getPremiu());
    }
}
