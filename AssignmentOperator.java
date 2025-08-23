import java.util.Scanner;

public class AssignmentOperator {
    public static void main(String[] args) {
        System.out.println("Assignment operator!");
        int Myint = 9;
        System.out.println(Myint);
        int Newint = Myint;
        System.out.println(Newint);
        System.out.println("Swap to number!");
        Scanner inp = new Scanner(System.in);
        System.out.print("please enter the first number: ");
        int num1 = inp.nextInt();
        System.out.print("please enter the second number: ");
        int num2 = inp.nextInt();
        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Value of First number: " + num1);
        System.out.println("Value of Second number: " + num2);
    }
}
