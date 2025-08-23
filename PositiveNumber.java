// Check whether number is negative,zero or positive
import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        if (num < 0 ){
            System.out.println("Number is negative");
        } else if (num == 0){
            System.out.println("Number is zero");
        } else {
            System.out.println("Number is positive");
        }
    }
}
