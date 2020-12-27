// import java.util.Scanner;

class rectangle{
    double length;
    double width;
    rectangle(double d,double w) {
       length=d;
       width=w;
    } 
    double area() {
        return length*width;
    }
} 
class re{
    public static void main(String[] args) {
     rectangle r1 = new rectangle(20,10);
     double vol =r1.area();
     System.out.println("Area is "+vol);   
    }
}