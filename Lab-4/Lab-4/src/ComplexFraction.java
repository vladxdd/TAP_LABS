import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;

public class ComplexFraction implements Complex {
    private String first, second;
    private double firsttodouble, secondtodouble, result;
    @Override
    public List<Double> enterFraction() {
        List<Double> forPolynom = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("How many number do you want to introduce:");
        String number = sc.nextLine();
        int numberint = 0;
        try {
            numberint = Integer.parseInt(number);
        } catch (NumberFormatException e) {
            System.out.println("You have not entered a number!!!");
            exit(1);
        }
        for(int i = 0; i < numberint; i++) {
            System.out.println("Enter numerator: ");
            first = sc.nextLine();
            System.out.println("Enter denominator: ");
            second = sc.nextLine();
            firsttodouble = Double.parseDouble(first);
            secondtodouble = Double.parseDouble(second);
            result = firsttodouble / secondtodouble;
            forPolynom.add(result);
        }
        return forPolynom;
    }
}
