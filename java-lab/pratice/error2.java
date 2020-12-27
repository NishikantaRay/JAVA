import java.util.*;
public class error2{
    static void check(int a,int b){
        if(a==b){
            throw new ArithmeticException("a==b");
        }
        else{
            System.out.println("No are"+a+b);
        }
    }
    public static void main(String args[]) {
        
        try {
            Scanner ac =new Scanner(System.in);
            System.out.println("Enter the no 1");
            int a=ac.nextInt();
            System.out.println("enter the no 2");
            int b=ac.nextInt();
            check(a, b);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        finally{
            System.out.println("hello i am in finally block");
        }
    }
}
