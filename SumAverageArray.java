import java.util.*;

public class SumAverageArray{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to calculate sum and average of array");
		System.out.print("Enter the size of an array: ");
		int size = input.nextInt();
		int[] array = new int[size];
		// Insert element of an array
		for (int i = 0;i < size;i++){
			System.out.print("Please enter element at position " + (i + 1) + ": ");
			array[i] = input.nextInt();

		}
		// traversal of an array
		for (int i = 0;i < size;i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
		sumAverage(array,size);
	}

	public static void sumAverage(int[] array,int size){
		int sum = 0;
		for (int i = 0;i < size;i++){
			sum += array[i];
		}
		int average = sum / size;
		System.out.println("Sum of an array is: " + sum);
		System.out.println("Average of an array is: " + average);
	}

}
