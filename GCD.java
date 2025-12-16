// create a program that calculate gcd of two numbers
import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to calculate GCD of numbers!");
        System.out.print("Enter the first number: ");
        int fnum = input.nextInt();
        System.out.print("Enter the Second number: ");
        int snum = input.nextInt();
        int gcd = gcd(fnum,snum);
        System.out.println("Gcd of number is: " + gcd);
    }

    public static int gcd(int fnum, int snum){
        int i = 2;
        int gcd = 1;
        int least = least(fnum,snum);
        while (i <= least){
            if ((fnum%i == 0) && (snum%i == 0)){
                gcd =i;
            }
            i++;
        }
        return gcd;
    }
    public static int least (int fnum, int snum){
        if (fnum<snum){
            return fnum;
        } else {
            return snum;
        }
    }

}
