import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
	public static void main(String [] args) {
		try {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int number1 = sc.nextInt();
		System.out.print("Enter Second number: ");
		int number2 = sc.nextInt();
		System.out.println("Enter the Aritmetic Operation: ");
		System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
		int option = sc.nextInt();
		switch(option) {
		case 1:
			int ans = number1+number2;
			System.out.println("The answer is " +ans);
			break;
		case 2:
			int ans1 = number1-number2;
			System.out.println("The answer is " + ans1);
			break;
		case 3:
			int ans2 = number1*number2;
			System.out.println("The answer is "+ans2);
			break;
		case 4:
			int ans3 = number1/number2;
			System.out.println("The answer is "+ ans3);
			break;
		
		}
		}catch (InputMismatchException e) {
			System.out.println("Enter only numbers");
		}catch (Exception e) {
			System.out.println("Enter valid number");
		}
		
	}

}
