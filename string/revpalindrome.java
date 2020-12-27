import java.util.*;
class revpalindrome {
  public static void main(String args[])
  {
    String original, reverse = "";
    int counter=1;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a string to reverse");
    original = in.nextLine();
    int length = original.length();
    // using logic
    // reverse
    for (int i = length - 1 ; i >= 0 ; i--)
      reverse = reverse + original.charAt(i);
    System.out.println("Reverse of the string: " + reverse);
    // palindrome
    for(int i=0;i<length-1;i++){
      if(original.charAt(i)==reverse.charAt(i)){
        counter++;
    }
    }
    if(counter==length)
      System.out.println("palindrome");
    else
       System.out.println("Not palindrome");
    // using predefined function
    // reverse
    StringBuilder input = new StringBuilder();
    input.append(original);

    input=input.reverse();
    System.out.println("Reverse of the string: Using reverse() " + input);
    // palindrome check
    String input1 =new String(input);
    boolean value =original.equalsIgnoreCase(input1);
    if(value)
      System.out.println("palindrome using equalsignorecase");
    else
       System.out.println("Not palindrome using equals ignore case");
  }
}