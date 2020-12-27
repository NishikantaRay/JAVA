import java.util.Scanner;

class square{
    int a;
    void get(){
        Scanner ac =new Scanner (System.in);
        System.out.println("Enter side");
        a=ac.nextInt();
    }
    void print(){
        System.out.println("result-"+a*a);
    }
}
class squ{
    public static void main(String args[]){
      square s =new square();
      s.get();
      s.print();
    }
}