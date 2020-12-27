import java.util.Scanner;

class employee
{
	int id;
	String dept,name;
	employee(int a, String b, String c)
	{
		id = a;
		name = b;
		dept = c;
	}
	employee(){
        id=2313;
        name="nishi";
        dept="Ece";
    }
	void disp()
	{
		System.out.println(id+ "\t" +name+ "\t" +dept);
	}

	void getData()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter ID : ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter NAME : ");
		name=sc.nextLine();
		System.out.println("Enter DEPT : ");
		dept=sc.nextLine();
    }
    employee(employee e1){
        id = e1.id;
		name = e1.name;
		dept = e1.dept;
    }
}
public class employeede
{
	public static void main(String[] args)
	{
        employee s=new employee();
        employee s1=new employee();
        employee s2=new employee(s);
		System.out.println("Enter the details");
		s.getData();
		System.out.println("RollNo.:\tName:\tBranch:\tCGPA:");
        s.disp();
        s2.disp();
        s1.disp();
	}
}