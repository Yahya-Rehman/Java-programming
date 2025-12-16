import java.util.*;
public class MaxMinArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to check Maximum and Minimum Element of Array");
        System.out.println("Enter the size of Array: ");
        int size  = input.nextInt();
        int[] arr = ArrayUtility.inputArray(size);

    }
    public static int max(int arr,int size){
        int max = 0;
        int i;
        int j;
        for (i = 0; i < size; i++){
            for (j = 0; j < size; j++){
                if (arr[j] < arr[i]) {
                    max = i;
                } else {
                    max = j;
                }
            }
        }
        return arr;
    }
}
