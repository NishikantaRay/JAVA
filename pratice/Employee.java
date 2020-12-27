import java.util.Scanner;
class person{
    static int id;
    static String name;
}
class Employee extends person{
    static String Dept;
    public static void input(){
        Scanner ac =new Scanner(System.in);
        System.out.println(" Enter your Id ");
        id =ac.nextInt();
        ac.nextLine();
        System.out.println(" Enter Your Name ");
        name=ac.nextLine();
        System.out.println(" Enter Your Dept ");
        Dept=ac.nextLine();
    }
    public static void print(){
        System.out.println("Id of the person------"+id);
        System.out.println("Name of the person----"+name);
        System.out.println("DEPT of the person----"+Dept);
    }
    public static void main(String args[]){
        input();
        print();
    }
}