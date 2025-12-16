// write a program that calculate sum of digit of number
import java.util.*;
public class SumOfDigit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to calculate som of digit of number!");
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int sum = 0;
        while(num != 0){
            sum += (num%10);
            num /= 10;
        }
        System.out.println("Sum of digit of number is: " + sum);
    }
}
