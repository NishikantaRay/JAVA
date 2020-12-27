import java.util.Scanner;
class employee{
    String name,dept,address,sic;
    double sal;
    void input(){
        Scanner ac =new Scanner(System.in);
        ac.nextLine();
        System.out.println("Enter employee name");
         name=ac.nextLine();
        System.out.println("Enter employee DEPT");
         dept=ac.nextLine();
        System.out.println("Enter employee Address");
         address=ac.nextLine();
        System.out.println("Enter employee Sic");
         sic=ac.nextLine();
        System.out.println("Enter employee Salary");
         sal=ac.nextDouble();
    }
    void print(){
        System.out.println("Name-"+name+"\t"+"DEpt-"+dept+"\t"+"Address-"+address+"\t"+"Sic-"+sic+"\t"+"salary="+sal);
    }
}
class emp {
    public static void main(String args[]) {
        
        employee e=new employee();
        e.input();
        e.print();

    }
    

}
