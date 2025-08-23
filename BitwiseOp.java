// create a program to perform bitwise operation
import java.util.Scanner;

public class BitwiseOp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Please enter the second number: ");
        int num2 = input.nextInt();
        System.out.println("And bitwise operation: " + (num1 & num2));
        System.out.println("Or bitwise operation: " + (num1 | num2));
        System.out.println("Xor bitwise operation: " + (num1 ^ num2));
        System.out.println("Bitwise Compliment operation: " + ~num1 + " " + ~num2);
        System.out.println("Bitwise right shift operator: " + (num1>>1));
        System.out.println("Bitwise left shift operator: " + (num2<<1));
    }
}