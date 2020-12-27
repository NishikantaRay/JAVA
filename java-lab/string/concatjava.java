import java.util.Scanner;
class concatjava {
  public static void main(String args[])
  {
    String first,second;
    Scanner ac=new Scanner(System.in);
    System.out.println(" Enter the First string ");
    first=ac.nextLine();
    System.out.println(" Enter the Second string ");
    second=ac.nextLine();
    System.out.println(" Final string is "+first+second);
    
    ac.close();
  }
}