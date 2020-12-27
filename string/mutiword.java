import java.util.Scanner;
public class mutiword { 
    static final int OUT = 0; 
    static final int IN = 1;  
    static int countWords(String str) 
    { 
        int state = OUT; 
        int count = 0; 
        for(int i=0;i < str.length();i++) 
        { 
            if (str.charAt(i) == ' ' || str.charAt(i) == '\n' || str.charAt(i) == '\t') 
                state = OUT;  
            else if (state == OUT) 
            { 
                state = IN; 
                ++count; 
            }   
        } 
        return count; 
    }  
    public static void main(String args[]) 
    {
        Scanner ac=new Scanner(System.in);
        System.out.println(" Enter your String ");
        String str = ac.nextLine();  
        System.out.println("No of words : " + countWords(str)); 
    } 
} 