import java.util.Scanner;
public class uppercase {
    public static void main(String[] args) {
        Scanner ac=new Scanner(System.in);
        System.out.println(" Enter your String ");
        String txt = ac.nextLine();
        System.out.println(" Convert to UpperCase letter ");
        System.out.println(txt.toUpperCase());
    }
  }