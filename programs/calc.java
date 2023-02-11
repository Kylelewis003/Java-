import java.util.Scanner;

public class calc {

	public static void main(String[] args) {
		char op;
		double num1, num2, res;
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose an operator +,-,*,or /");
		op = sc.next().charAt(0);
		System.out.println("Enter the first number : ");
		num1 = sc.nextInt();
		System.out.println("Enter the second number : ");
		num2 = sc.nextInt();
		switch (op) {
			case '+':
				res = num1 + num2;
				System.out.println(num1 + " + " + num2 + " = " + res);
				break;
			case '-':
				res = num1 - num2;
				System.out.println(num1 + " - " + num2 + " = " + res);
				break;
			case '*':
				res = num1 * num2;
				System.out.println(num1 + " * " + num2 + " = " + res);
				break;
			case '/':
				res = num1 / num2;
				System.out.println(num1 + " / " + num2 + " = " + res);
				break;
			default:
				System.out.println("Invalid Input");
				break;
		}

	}

}
