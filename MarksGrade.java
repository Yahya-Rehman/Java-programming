// Find the grade of student according to marks
import java.util.Scanner;

public class MarksGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the marks obtain in Exam: ");
        int marks = input.nextInt();

        if (marks>=90){
            System.out.println("Grade is: A");
        } else if (marks>=75 && marks<90){
            System.out.println("Grade is: B");
        } else if (marks>=60 && marks<75){
            System.out.println("Grade is: C");
        } else if (marks>=30 && marks<60){
            System.out.println("Grade is: D");
        } else {
            System.out.println("Grade is: F");
        }
    }
}
