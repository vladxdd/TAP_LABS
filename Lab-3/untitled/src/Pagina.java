public class Pagina extends Model{
  private Cuvant[] cuvinte;

  public Pagina(Cuvant[] cuvinte) {
    this.cuvinte = cuvinte;
  }

  public void afisare() {
    System.out.println("Pagina contine urmatoarele cuvinte:");
    for (Cuvant cuvant : cuvinte) {
      System.out.println(cuvant.getText());
    }
  }

  public void afisare(int n) {
    System.out.println("Primele " + n + " cuvinte din pagina sunt:");
    for (int i = 0; i < n && i < cuvinte.length; i++) {
      System.out.println(cuvinte[i].getText());
    }
  }

    @Override
    public void afisareInvers() {
        System.out.println("Pagina contine urmatoarele cuvinte in ordine inversa:");
        for (int i = cuvinte.length - 1; i >= 0; i--) {
            System.out.println(cuvinte[i].getText());
        }
    }
}
