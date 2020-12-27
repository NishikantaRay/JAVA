class Areaofrect{
   int b;
    Areaofrect(double a,double b){
        System.out.println(" Area of Rectangle "+a*b);
    }
    Areaofrect(int a){
        b=10;
        System.out.println(" Area of Rectangle "+a*b);
    }
}
class Areaclass{
    public static void main(String args[]) {
        Areaofrect s2=new Areaofrect(3, 4);
        Areaofrect s3= new Areaofrect(6);
    }
}
