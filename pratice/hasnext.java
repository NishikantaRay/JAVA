import java.util.*;  
public class hasnext {    
    public static void main(String args[]){       
        String s = "Hello World!";    
        Scanner scan = new Scanner(s);  
        System.out.println("Result: " + scan.hasNext());    
        System.out.println("String: " +scan.nextLine());    
        System.out.println("Final Result: " + scan.hasNext());  
        scan.close();  
       }    
}  