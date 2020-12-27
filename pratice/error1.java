import java.util.*;
public class error1{
    public static void main(String args[]) {
        Scanner ac =new Scanner(System.in);
        int a=ac.nextInt();
        int b=ac.nextInt();
        try {
            if(a==b){
                throw new Exception("a==b");
            }
            else{
                System.out.println("No are"+a+b);
            }
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }
        finally{
            System.out.println("hello i am in finally block");
        }
    }
}