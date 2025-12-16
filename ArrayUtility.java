import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(int size){
        Scanner input = new Scanner(System.in);
        int size1 = size;
        System.out.println("enter the element of array: ");
        int[] arr = new int[size1];
        for (int i = 0;i<size1;i++){
            System.out.println("Enter the element at position " + i + ": ");
            arr[i] = input.nextInt();
        }
    return arr;
    }
}
