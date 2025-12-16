// Create to calculate the sum off odd numbers
import java.util.Scanner;
public class OddSum {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to calculate the sum of odd number!");
		System.out.print("Enter the number: ");
		int num = input.nextInt();
		calculateOddSum(num);
	}

	public static void calculateOddSum(int num){
		int i = 1;
		int sum = 0;
		while (i<=num){
			sum += i;
            i += 2;
		}
		System.out.println("Sum of odd numbers: " + sum);	
	}
}
