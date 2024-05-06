public class ComplexFraction extends Number {
    private double real;
    private double imaginary;

    public ComplexFraction(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    @Override
    public Number add(Number num) {
        if (num instanceof Complex) {
            Complex c = (Complex) num;
            return new Complex(this.real + c.real, this.imaginary + c.imaginary);
        } else if (num instanceof ComplexFraction) {
            ComplexFraction cf = (ComplexFraction) num;
            return new ComplexFraction(this.real + cf.real, this.imaginary + cf.imaginary);
        }
        return null;
    }

    @Override
    public Number subtract(Number num) {
        if (num instanceof Complex) {
            Complex c = (Complex) num;
            return new Complex(this.real - c.real, this.imaginary - c.imaginary);
        } else if (num instanceof ComplexFraction) {
            ComplexFraction cf = (ComplexFraction) num;
            return new ComplexFraction(this.real - cf.real, this.imaginary - cf.imaginary);
        }
        return null;
    }

    @Override
    public String toString() {
        return "(" + real + " + " + imaginary + "i)";
    }
}
