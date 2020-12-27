import java.util.Scanner;

class Student 
{ 
    public int roll_no; 
    public String name,branch;
    public double cgpa; 
    Student(int roll_no, String name,String branch,double cgpa) 
    { 
        this.roll_no = roll_no; 
        this.name = name; 
        this.branch=branch;
        this.cgpa=cgpa;
    } 
    Student(){}
    void getData() {
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter roll");
        roll_no=sc.nextInt();
        sc.nextLine();
        System.out.println("enter name"); 
        name=sc.nextLine();
        System.out.println("enter Branch"); 
        branch=sc.nextLine();
        System.out.println("enter Cgpa"); 
        cgpa=sc.nextDouble();
     } 
} 
  
public class stu 
{ 
    public static void main (String[] args) 
    {  
        Student[] arr;  
        arr = new Student[3]; 
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = new Student();
        }
        for(int i=0;i<arr.length;i++)
        {
            arr[i].getData();
        }
        for (int i = 0; i < arr.length; i++) 
            System.out.println("Student at " + i + " : " + "Roll no-"+
                        arr[i].roll_no +" "+"Name-"+ arr[i].name+"  "+"Branch-"+arr[i].branch+" "+"Cgpa-"+arr[i].cgpa);
         for(int i=0;i<arr.length;i++)
         {
            if(arr[0].cgpa<arr[i].cgpa)
            {
               arr[0].cgpa= arr[i].cgpa;
            }
             
         }
         System.out.println("TOP ranker="+arr[0].cgpa);
    } 
} 
