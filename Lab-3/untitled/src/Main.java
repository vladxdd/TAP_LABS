public class Main {
    public static void main(String[] args) {
        Cuvant cuvant1 = new Cuvant("Java");
        Cuvant cuvant2 = new Cuvant("este");
        Cuvant cuvant3 = new Cuvant("un");
        Cuvant cuvant4 = new Cuvant("limbaj");
        Cuvant cuvant5 = new Cuvant("de");
        Cuvant cuvant6 = new Cuvant("programare");

        Cuvant[] cuvintePagina = {cuvant1, cuvant2, cuvant3, cuvant4, cuvant5, cuvant6};
        Pagina pagina = new Pagina(cuvintePagina);

        pagina.afisare();
        pagina.afisare(3);
        pagina.afisareInvers();
    }
}
