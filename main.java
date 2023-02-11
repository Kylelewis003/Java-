
import java.util.Scanner;

class staff 
{
	private String staffid;
	private String name;
	private long phone;
	private float salary;
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Staff ID : ");
		staffid = sc.next();
		System.out.println("Enter Staff Name : ");
		name = sc.next();
		System.out.println("Enter Staff Phone no : ");
		phone = sc.nextLong();
		System.out.println("Enter Staff Salary : ");
		salary = sc.nextInt();
	}
	public void display()
	{
		System.out.println("Staff ID : "+staffid);
		System.out.println("Staff Name  : "+name);
		System.out.println("Staff Phone no : "+phone);
		System.out.println("Staff Salary : "+salary);	
	}
}
class teachings extends staff
{
	private String domain;
	private String[] publications;
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		super.input();
		System.out.println("Enter Domain : ");
		domain = sc.next();
		System.out.println("Enter the number of publications : ");
		int n = sc.nextInt();
		publications = new String[n];
		System.out.println("Enter the publications : ");
		for(int i = 0 ;i<n ; i++)
		{
			publications[i] = sc.next();
			
		}
		System.out.println("");
	}
	public void display()
	{
		super.display();
		System.out.println("Domain : "+domain);
		System.out.println("Publications : ");
		for(int i = 0 ; i<publications.length ; i++)
		{
			System.out.println(publications[i]);
		}
		System.out.println("");
	}
}
class technical extends staff
{
	private String[] skills;
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		super.input();
		System.out.println("Enter the number of skills : ");
		int n = sc.nextInt();
		skills = new String[n];
		System.out.println("Enter the skills : ");
		for(int i = 0 ;i<n ; i++)
		{
			skills[i] = sc.next();
		}
		System.out.println("");
	}
	public void display()
	{
		super.display();
		System.out.println("Skills : ");
		for(int i = 0 ; i<skills.length ; i++)
		{
			System.out.println(skills[i]);
		}
		System.out.println("");
	}
}
class contract extends staff
{
	private int period;
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		super.input();
		System.out.println("Enter Period : ");
		period = sc.nextInt();
		System.out.println("");
	}
	public void display()
	{
		super.display();
		System.out.println("Period : "+period);
		System.out.println("");
	}
}
public class main {

	public static void main(String[] args) 
	{
		teachings t = new teachings();
		technical t1  = new technical();
		contract t2 = new contract();
		System.out.println("Enter Details for Teaching Staff Member :");
		System.out.println("");
		t.input();
		System.out.println("Details for Teaching Staff Member :");
		System.out.println("");
		t.display();
		System.out.println("Enter Details for Technical Staff Member :");
		System.out.println("");
		t1.input();
		System.out.println("Details for Technical Staff Member :");
		System.out.println("");
		t1.display();
		System.out.println("Enter Details for Contract Staff Member :");
		System.out.println("");
		t2.input();
		System.out.println("Details for Contract Staff Member :");
		System.out.println("");
		t2.display();
		
	}

}
