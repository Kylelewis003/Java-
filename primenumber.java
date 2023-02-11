
import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		int n, flag = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		n = sc.nextInt();

		if (n == 1 || n == 0) {
			System.out.println(n + " is not a Prime number ");
		} else {
			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					flag++;
					break;
				}
			}
		}
		if (flag == 0) {
			System.out.println(n + " is a Prime number");
		}

		else {
			System.out.println(n + " is not a Prime number ");
		}

	}

}
