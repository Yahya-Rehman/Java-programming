// Area of triangle
import java.util.Scanner;

public class OperatorProblem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base of triangle: ");
        float B = input.nextFloat();
        System.out.println("Enter the hieght of triangle: ");
        float H = input.nextFloat();
        double Area = 0.5 * B * H;
        System.out.println("Area of triangle: " + Area);
    }
}