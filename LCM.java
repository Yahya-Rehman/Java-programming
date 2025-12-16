// create a program that calculate lcm of two numbers
import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to calculate the lcm of number!");
        System.out.print("Enter the first number: ");
        int first = input.nextInt();
        System.out.print("Enter the second number: ");
        int second = input.nextInt();
        int lcm = lcm(first,second);
        System.out.println("Lcm of numbers is: " + lcm);
    }

    public static int lcm (int fst,int scnd){
        int i = 1;
        while (true){
            int factor = fst * i;
            if (factor % scnd == 0){
                return factor;
            }
            i++;
        }
    }
}
