public class Main {
    public static void main(String[] args) {
        Number num1 = new Complex(3, 4);
        Number num2 = new ComplexFraction(2, 3);

        Number sum = num1.add(num2);
        Number difference = num1.subtract(num2);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
    }
}
