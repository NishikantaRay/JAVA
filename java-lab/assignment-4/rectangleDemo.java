import java.util.Scanner;

class rectangle{
    double length;
    double width;
    double area() {
        return length*width;
    }
    void setDim() {
        Scanner sc =new Scanner(System.in);
        System.out.println(" Enter the length ");
        length = sc.nextDouble();
        System.out.println(" Enter the Width ");
        width = sc.nextDouble();
        sc.close();
    } 
   
} 
class rectangleDemo{
    public static void main(String[] args) {
     rectangle r1 = new rectangle();
     r1.setDim();
     double vol =r1.area();
     System.out.println("Area is "+vol);   
    }
}