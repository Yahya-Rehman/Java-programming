import java.util.Scanner;

public class OperatorProblem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter principal: ");
        double principal = input.nextDouble();
        System.out.println("Enter rate of interest: ");
        double rate = input.nextDouble();
        System.out.println("Enter time of period: ");
        int time = input.nextInt();

        double si = (principal * rate * time)/100;
        System.out.println("Simple interest is: " + si);
        double ci = principal * (1 + (rate/100)) * time;
        System.out.println("Campound interest is: " + ci);
    }
}
