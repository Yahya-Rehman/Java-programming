// create a program that calculate number is prime or not
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to calculate prime number!");
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        boolean prime = isprime(num);
        if (prime){
            System.out.println("Your number is prime");
        } else {
            System.out.println("Your number is not prime");
        }
    }

    public static boolean isprime(int num){
        int i = 2;
        while (i<num){
            if (num % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}
