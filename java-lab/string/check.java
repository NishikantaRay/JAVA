import java.util.Scanner;
class check {
  static int check(String first,String second){
    int length=first.length();
    int length1=second.length();
    if(length==length1){
      return 0;
    }else if(length>length1){
      return 1;
    }else{
      return -1;
    }
  }
  public static void main(String args[])
  {
    String first,second;
    Scanner ac=new Scanner(System.in);
    System.out.println(" Enter the First string ");
    first=ac.nextLine();
    System.out.println(" Enter the Second string ");
    second=ac.nextLine();
    System.out.println(" Equals String return 0 \n If string 1 greaterthan string 2 then 1\n if string 2 is greater than string 1 return -1 ");
    System.out.println(check(first, second));
    ac.close();
  }
}