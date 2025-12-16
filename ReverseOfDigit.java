// create a program that reverse the digit
import java.util.Scanner;

public class ReverseOfDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Reverse digit of number!");
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int reverse = reversenum(num);
        System.out.println("Reverse of your number is: " + reverse);
    }
    public static int reversenum(int num){
        int newNum = 0;
        while (num > 0){
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }
        return newNum;
    }
}
