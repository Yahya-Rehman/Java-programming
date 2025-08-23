// Create a program to categorize person into different age group
import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Age of person: ");
        int age = input.nextInt();

        if (age<13){
            System.out.println("It lies under the category of Child");
        } else if (age>=13 && age<20){
            System.out.println("It lies under the category of Teenager");
        } else if (age>=20 && age<50){
            System.out.println("It lies under the category of Adult");
        } else{
            System.out.println("It lies under the category of Senior");
        }
    }
}
