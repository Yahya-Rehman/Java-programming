import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your first number: ");
        int fNum = input.nextInt();
        System.out.print("Please enter your second number: ");
        int sNum = input.nextInt();
        int sum = fNum + sNum;
        System.out.println("Addition of two number: " + sum);
    }
}
