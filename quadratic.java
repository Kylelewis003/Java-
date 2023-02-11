import java.util.Scanner;

public class quadratic {

	public static void main(String[] args) {
		double d,r1,r2,real,img;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the coefficient for quadrtic equation :");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		if(a==0)
		{
			System.out.println("Inavlid Input");
			System.out.println("Coefficient 'a' cannot be equal to zero");			
		}
		else
		{
			d = (b*b)-(4*a*c);
			if(d == 0)
			{
				System.out.println("The roots are real and equal");
				r1 = r2 = -b/(2*a); 
				System.out.println("The Roots are :");
				System.out.println("Root1 = "+r1);
				System.out.println("Root2 = "+r2);
			}
			else if(d>0)
			{
				System.out.println("The roots are real and unequal");
				r1 = (-b + Math.sqrt(d))/(2*a);
				r2 = (-b - Math.sqrt(d))/(2*a);
				System.out.println("The Roots are :");
				System.out.println("Root1 = "+r1);
				System.out.println("Root2 = "+r2);
			}
			else
			{
				System.out.println("The roots are imaginary");
				real = -b/(2*a);
				img = Math.sqrt(-d)/(2*a);
				System.out.println("The Roots are :");
				System.out.println("Root1 = "+real+" +"+img+"i");
				System.out.println("Root2 = "+real+" -"+img+"i");
			}
		}
	}

}