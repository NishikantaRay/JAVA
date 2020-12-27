interface Calculator{
    double add();
    double sub();
    double mul();
    double div();
}
class driver implements Calculator{
    double x,y;
    driver(double x,double y){
        this.x=x;
        this.y=y;
    }
    public double add(){
        return x+y;
    }
    public double sub(){
        return x-y;
    }
    public double mul(){
        return x*y;

    }
    public double div(){
        return x/y;
    }
}
class demoCalculator{
    public static void main(String args[]) {
        driver a=new driver(5,6);
        System.out.println(" Addition is "+a.add());
        System.out.println(" Substration is "+a.sub());
        System.out.println(" Multiplication is "+a.mul());
        System.out.println(" Division is "+a.div());
        
    }
}