// create a program that number is palindrome or not
import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to check number is palindrome!");
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        ispalindrome(num);
    }
    public static void ispalindrome(int num){
        int digit;
        int newnum = 0;
        int n1 = num;
        while (num > 0){
            digit = num % 10;
            num /= 10;
            newnum = newnum * 10 + digit;
        }
        if (newnum == n1){
            System.out.println("Your number is palindrome");
        } else {
            System.out.println("Your number is not palindrome");
        }
    }
}
