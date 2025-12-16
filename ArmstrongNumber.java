import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to check number is Armstrong number!");
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        boolean Armstrong = isArmstrong(num);
        if (Armstrong){
            System.out.println("Your number is Armstrong!");
        } else {
            System.out.println("Your number is not Armstrong!");
        }
    }

    public static boolean isArmstrong (int num){
        int sum = 0;
        int noOfDigit = noOfDigit(num);
        int n1 = num;
        while (n1 > 0){
            int digit = n1 % 10;
            n1 /= 10;
            sum += power(digit,noOfDigit);
        }
        return sum == num;
    }
    public static int power(int digit,int noOfDigit){
        int i = 0;
        int result = 1;
        while (i < noOfDigit){
            result *= digit;
            i++;
        }
        return result;
    }

    public static int noOfDigit(int num){
        int digit = 0;
        while (num > 0){
            digit++;
            num /= 10;
        }
        return digit;
    }
}
