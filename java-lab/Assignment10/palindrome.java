import java.util.*;
class palindrome {
  public static void main(String args[])
  {
    String original;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a string ");
    original = in.nextLine();
    StringBuilder input = new StringBuilder();
    input.append(original);
    input=input.reverse();
    String input1 =new String(input);
    boolean value =original.equalsIgnoreCase(input1);
    if(value)
      System.out.println("palindrome ");
    else
       System.out.println(" Not palindrome ");
  }
}