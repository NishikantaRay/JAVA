import java.util.Scanner;

class Stud
{
	int rollNo;
	float cgpa;
	String name;
	String branch;
	Stud(int a, Float b, String c, String d)
	{
		rollNo = a;
		name = c;
		branch = d;
		cgpa = b;
		
	}
	Stud(){}
	void disp()
	{
		System.out.println(rollNo+ "\t" +name+ "\t" +branch+ "\t" +cgpa);
	}

	void getData()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter ROLL NO. : ");
		rollNo = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter NAME : ");
		name=sc.nextLine();
		System.out.println("Enter BRANCH : ");
		branch=sc.nextLine();
		System.out.println("Enter CGPA : ");
		cgpa=sc.nextFloat();
	}
}
public class Student
{
	public static void main(String[] args)
	{
		int i;
		Stud s[]=new Stud[2];
		for(i=0;i<2;i++)
		{
			s[i]=new Stud();
		}
		System.out.println("Enter the details");
		for(i=0;i<2;i++)
		{
			s[i].getData();
		}
		System.out.println("RollNo.:\tName:\tBranch:\tCGPA:");
		for(i=0;i<2;i++)
		{
			s[i].disp();
		}
	}
}