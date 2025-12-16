// create a program that calculate factorial of number
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to calculate Factorial of given number!");
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        factorial(num);
    }

    public static void factorial(int number){
        int i = 1;
        int fact = 1;

        while (i<=number){
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of number is: " + fact);
    }
}
