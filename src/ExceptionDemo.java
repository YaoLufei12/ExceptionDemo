import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
    private double divisor;
    private double dividend;
    private double result;

    public void divide(){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the divisor: ");
            double divisor = scanner.nextDouble();

            System.out.print("Enter the dividend: ");
            double dividend = scanner.nextDouble();

            if (dividend == 0) {
                System.out.println("Error: Dividend cannot be zero.");
            } else {
                double result = divisor / dividend;
                System.out.println("The result of the division is: " + result);
            }
        } catch (InputMismatchException e) {
        System.out.println("An exception occurred:" + e.getMessage());
    }
}
