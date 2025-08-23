// Calculate celcius from fahrenhiet
import java.util.Scanner;

public class OperatorProblem5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit: ");
        double F = input.nextDouble();
        double C = (((F-32)*5)/9);
        System.out.println("Value of temperature in Celcius: " + C);
    }
}
