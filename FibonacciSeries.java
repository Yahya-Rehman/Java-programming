// create a program that print fibonacci series
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to print Fibonacci series!");
        System.out.print("Enter the number up to which series has to be printed: ");
        int num = input.nextInt();
        fibonacci(num);
    }

    public static void fibonacci (int num){
        int n1 = 0;
        int n2 = 1;
        int newnum;
        System.out.print(n1 + " ");
        System.out.print(n2 + " ");
        while (n1 + n2 <= num){
            newnum = n1 + n2;
            System.out.print(newnum + " ");
            n1 = n2;
            n2 = newnum;
        }
    }
}
