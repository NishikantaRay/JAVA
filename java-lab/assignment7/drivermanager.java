class Employee{
    String empName,empId;
    Double empSal;
    Employee(String empName,String empId,Double empSal){
        this.empName=empName;
        this.empId=empId;
        this.empSal=empSal;
    }
}
class Manager extends Employee{
    Double bonous;
    Manager(String empName,String empId,Double empSal,Double bonous){
        super(empName, empId, empSal);
        this.bonous=bonous;
    }
    void display(){
        System.out.println(" Employee details ");
        System.out.println(" Employee Name -"+empName);
        System.out.println(" Employee Id -"+empId);
        System.out.println(" Employee Salary -"+empSal);
        System.out.println(" Employee Bonous -"+bonous);

    }
}
class drivermanager {
    public static void main(String args[]) {
        Manager ob=new Manager("NISHIKANTA RAY", "ECE-190410294", 10000.50, 4538.43);
        ob.display();
        
    }   
}
