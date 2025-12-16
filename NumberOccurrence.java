// create a program that print number of occurrence of an array elements
import java.util.*;

public class NumberOccurrence{

	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to check the occurrences of element of an array!");
		System.out.print("Enter the size of array: ");
		int size = input.nextInt();
		int[] arr = new int[size];
		for (int i = 0;i < size;i++){
            System.out.print("Please enter number at " + i + ":");
            arr[i] = input.nextInt();
		}
        System.out.print("Enter the number you want to find: ");
		int num = input.nextInt();
        numoccurrence(arr,size,num);
	}
	public static void numoccurrence(int[] arr,int size,int num) {
        int i = 0,occ = 0;
        for (i = 0;i<size ;i++){
            if (num == arr[i]) {
                occ++;
            }
        }
        System.out.println("Element " + num + " occure at " + occ + " Times.");
    }
}
