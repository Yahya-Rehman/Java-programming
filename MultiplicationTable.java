// create a program to print the multiplication table of given number
import java.util.Scanner;

public class MultiplicationTable{

	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome top Calculate Multiplication Table of Number");
		System.out.print("Please enter the number: ");
		int num = input.nextInt();
		System.out.println();
		multiplyer(num);
	}

	public static void multiplyer(int num){
		int i = 1;
		while (i<=10){
			System.out.println(num + " x " + i + " = " + (num*i) );
			i++;
		}
	}

}
