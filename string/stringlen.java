import java.util.Scanner;
class stringlen {
  public static void main(String[] args) {
    Scanner ac=new Scanner(System.in);
    System.out.println(" Enter a string ");
    String str=ac.nextLine();
    int len=str.length();
    int count = 0;
    for (char c : str.toCharArray())
        count++;
    System.out.println(" Length by logic : " + count+" using length() "+len);
    ac.close();
  }
}