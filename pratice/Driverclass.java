import java.util.Scanner;
class Employee{
    int empID;
    String empName;
    double empSal;
}
class Manager extends Employee{
    double bonous;
    Manager(){}
    void input(){
        Scanner ac =new Scanner(System.in);
        System.out.println(" Enter your Id ");
        empID =ac.nextInt();
        ac.nextLine();
        System.out.println(" Enter Your Name ");
        empName=ac.nextLine();
        System.out.println(" Enter Your Salary ");
        empSal=ac.nextDouble();
        System.out.println(" Enter your Bonous ");
        bonous =ac.nextDouble();
    }
    void print(){
        System.out.println("Id of the person------"+empID);
        System.out.println("Name of the person----"+empName);
        System.out.println("Salary of the person----"+empSal);
        System.out.println("Bonous of the person----"+bonous);
    }
    
}
public class Driverclass{
    public static void main(String args[]){
       Manager m1=new Manager();
       m1.input();
       m1.print(); 
    }
}