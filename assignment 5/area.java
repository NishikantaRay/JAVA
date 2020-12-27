class poly{
    double res(double a){
        return (3.141*a*a);
    }
    double res(int a){
        return (a*a);
    }
    double res(double a,double b){
        return a*b;
    }
}
class area{
    public static void main(String args[]) {
        poly s= new poly();
        poly s1= new poly();
        poly s2= new poly();
        System.out.println(" Area of circle = "+s.res(15.0));
        System.out.println(" Area of square = "+s1.res(32));
        System.out.println(" Area of rectangle = "+s2.res(15, 16));
    }
}