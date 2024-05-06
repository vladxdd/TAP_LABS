public class Complex extends Number {
    double real;
    double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    @Override
    public Number add(Number num) {
        if (num instanceof Complex) {
            Complex c = (Complex) num;
            return new Complex(this.real + c.real, this.imaginary + c.imaginary);
        } else if (num instanceof ComplexFraction) {
            ComplexFraction cf = (ComplexFraction) num;
            return new Complex(this.real + cf.getReal(), this.imaginary + cf.getImaginary());
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
            return new Complex(this.real - cf.getReal(), this.imaginary - cf.getImaginary());
        }
        return null;
    }

    @Override
    public String toString() {
        return "(" + real + " + " + imaginary + "i)";
    }
}
