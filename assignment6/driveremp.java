class Employee{
    String empName;
    int empNo;
    double basicSal,da,hra,grossSal;
    Employee(int empNo,String empName,double basicSal){
        this.empNo=empNo;
        this.empName=empName;
        this.basicSal=basicSal;
    }
    double calGrossSal(){
        da=0.2*basicSal;
        hra=0.1*basicSal;
        grossSal=basicSal+da+hra;
        return grossSal;
    }
    void showEmpDetails(Employee e1,Employee e2){
        System.out.println("----EMPLOYEE TABLE----");
        System.out.println("EMPNO\t"+"EMPNAME\t"+"GROSSSAL");
        System.out.println(e1.empNo+"\t"+e1.empName+"\t"+e1.calGrossSal());
        System.out.println(e2.empNo+"\t"+e2.empName+"\t"+e2.calGrossSal());
        System.out.println("----EMPLOYEE TABLE END----");
    }
}
public class driveremp {
    public static void main(String args[]) {
        Employee e1=new Employee(01, "ram", 2000.0);
        Employee e2=new Employee(02, "gam", 3000.0);
        e1.showEmpDetails(e1,e2);
    }
    
}
