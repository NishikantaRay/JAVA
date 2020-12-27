import java.util.Scanner;
public class prime {
    int n ;
    public static boolean checkprime(int n){
        if(n< 2){
            return false;
        }
        int limit =(int)Math.sqrt(n);
        for(int i=2;i<=limit;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        System.out.println("Enter the number");
        Scanner ac =new Scanner(System.in);
        int n = ac.nextInt();
        System.out.println(checkprime(n));
        
    }
}
