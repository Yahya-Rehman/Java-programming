// Perimeter of rectangle
import java.util.Scanner;

public class OperatorProblem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first side of rectangle: ");
        int A = input.nextInt();
        System.out.print("Enter the second side of rectangle: ");
        int B = input.nextInt();
        int Perimeter = 2*A + 2*B;
        System.out.println("Perimeter of rectangle is: " + Perimeter);

    }
}
