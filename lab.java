import java.util.Scanner;

class Student
{
	String usn,name,branch,ph;
	Student()
	{
		usn = name = branch = ph =  "no value ";
	}
	void readata(String u , String n , String b , String p)
	{
		usn = u;
		name = n;
		branch = b;
		ph = p;
	}
	void display()
	{
		System.out.println(usn+"\t"+name+"\t"+branch+"\t"+ph);
	}
}

public class lab 
{
	public static void main(String[] args)
	{
		String u,n,b,p;
		int no;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number of Students : ");
		no = sc.nextInt();
		
		Student [] s = new Student[no];
		
		for(int i = 0 ; i<s.length ; i++)
		{
			System.out.println("Enter the Student "+(i+1)+" information : ");
			s[i] = new Student();
			System.out.println("Enter Student usn no : ");
			u = sc.next();
			System.out.println("Enter Student name : ");
			n = sc.next();
			System.out.println("Enter Student branch : ");
			b = sc.next();
			System.out.println("Enter Student phone no : ");
			p = sc.next();
			
			s[i].readata(u,n,b,p);
			
		}
		System.out.println("Student Information are : ");
		System.out.println("USN\tNAME\tBRANCH\tPHONE NO");
		for(int i = 0 ; i<s.length ; i++)
		{
			s[i].display();
		}
	}
}
