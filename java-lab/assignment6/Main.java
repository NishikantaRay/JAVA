import java.util.Scanner;

class Employee {
    private String empName;
    private String empNo;
    private int dependentCnt;

    public Employee(String empName, String empNo, int dependentCnt) {
        this.empName = empName;
        this.empNo = empNo;
        this.dependentCnt = dependentCnt;
    }

    public void showEmpDetails() {
        System.out.println("Emp No : " + empNo);
        System.out.println("Emp Name : " + empName);
    }

    public int getDependentCnt() {
        return dependentCnt;
    }
}

public class Main {

    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter no of employees : ");
        int N = sc.nextInt();

        Employee[] employee = new Employee[N];

        for(int i = 0;i<N;i++) {
            sc.nextLine();
            employee[i] = input();
        }


        for (int i = 0;i<N;i++)
            if(employee[i].getDependentCnt() > 2)
                employee[i].showEmpDetails();
    }

    public static Employee input() {
        System.out.println("Enter name : ");
        String empName = sc.nextLine();
        System.out.println("Enter emp no. : ");
        String empNo = sc.nextLine();
        System.out.println("Enter dependent count : ");
        int dependentCnt = sc.nextInt();
        return new Employee(empName,empNo,dependentCnt);
    }
}