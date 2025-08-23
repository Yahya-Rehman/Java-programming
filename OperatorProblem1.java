// Product of two float number
import java.util.Scanner;

public class OperatorProblem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first float number: ");
        float a = input.nextFloat();
        System.out.print("Enter the second float number: ");
        float b = input.nextFloat();
        float result = a * b;
        System.out.print("Product of two float number: " + result);
    }
}
