import java.util.Scanner;

public class EvenOddBitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int num = input.nextInt();

        if ((num & 1) == 0){
            System.out.println("Number is Even number");
        } else{
            System.out.println("Number is Odd number");
        }
    }
}
