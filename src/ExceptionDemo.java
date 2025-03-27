import java.util.Scanner;

public class ExceptionDemo {
    private double divisor;
    private double dividend;
    private double result;

    public void divide(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the divisor: ");
        double divisor = scanner.nextDouble();

        System.out.print("Enter the dividend: ");
        double dividend = scanner.nextDouble();

        double result = divisor / dividend;
        System.out.println("The result of the division is: " + result);


    }
}
