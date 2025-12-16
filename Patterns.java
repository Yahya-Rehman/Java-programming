// create a program that print patterns
import java.util.*;


public class Patterns {

	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Print Patterns!");
		System.out.print("Enter the number of rows:");
		int number = input.nextInt();
		System.out.println();
		spattern(number);
		System.out.println();
		rpattern(number);
		System.out.println();
		lpattern(number);
		System.out.println();
		rrpattern(number);
		System.out.println();
		kpattern(number);
		System.out.println();
	//	hollowsq(number);
	}

	public static void spattern(int num){
		int i,j;
		for (i = 1 ; i <= num; i++){
			for (j = 1; j <= num; j++){
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	public static void rpattern(int  num){
		int i,j;
		for (i = 1;i <= num;i++){
			for (j = 1;j <= num;j++){
				if (j <= i){
					System.out.print("* ");
				}
			}
			System.out.println();
		}	
	}

	public static void lpattern(int num){
		int i,j,k;
		for (i = 1;i <= num;i++){
			for (j = 1; j <= num-i;j++){
				System.out.print("  ");
			}
			for (j = 1;j <= i;j++){
				System.out.print("* ");
			}
			System.out.println();
	
		}
	}

	public static void rrpattern(int num){
		int i,j;
		for (i = 1;i <= num;i++){
			for (j =num;j > 0;j--){
				if (j>=i){
					System.out.print("* ");	
				}
			}
			System.out.println();
		}
	}

	public static void kpattern(int num){
		int i,j;
		for (i = 1;i <= num;i++){
                        for (j = 1;j <= num;j++){
                                if (j >= i){
                                        System.out.print("* ");
                                }
                        }
                        System.out.println();
		}
		for (i = 2;i <= num;i++){
			for (j = 1;j <= num;j++){
				if (j <= i){
                                        System.out.print("* ");
                                }
                        }
                        System.out.println();

	
		}
	
	}

}


