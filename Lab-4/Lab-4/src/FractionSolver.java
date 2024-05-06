import java.util.List;

public class FractionSolver {
    private final Complex fraction;
    public FractionSolver(Complex fraction) {
        this.fraction = fraction;
    }

    public void solver() {
        List<Double> doubles = fraction.enterFraction();
        double fractionsum = 0;
        for(double fractionresult : doubles) {
            fractionsum += fractionresult;
        }
        System.out.println("The sum of the polynomial is: " + fractionsum);
    }
}
