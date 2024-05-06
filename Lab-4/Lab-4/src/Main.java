public class Main {
    public static void main(String[] args) {
        ComplexFraction fractionPolynom = new ComplexFraction();
        FractionSolver solver = new FractionSolver(fractionPolynom);
        solver.solver();
    }
}