class Point2D {
    private int x;
    private int y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
        this(0,0);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}

class Circle extends Point2D{
    Double radius;
    String color;
    public Circle(int x, int y,Double radius,String color){
        super(x,y);
        this.color=color;
        this.radius=radius;
    }
    public Circle(){
        super();
        this.color="red";
        this.radius=1.0;
    }
    public Double getRadius(){
        return radius;
    }
    public void setRadius(Double radius){
        this.radius=radius;
    }
    public String getColor(){
        return color;
    }
    public void SetColor(String color){
        this.color=color;
    }
    @Override
    public String toString() {
        return "Circle"+"["+"Center"+"(" + getX() + "," + getY() + ") ,"+"radius ="+getRadius()+"color="+getColor()+"]";
    }
}
class Cylinder extends Circle{
    Double height;
    public Cylinder(int x, int y,Double radius,String color,Double height){
        super(x,y,radius,color);
        this.height=height;
    }
    public Cylinder(){
        super();
        this.height=1.0;
    }
    public Double getHeight(){
        return height;
    }
    public void setHeight(Double height){
        this.height=height;
    }
    @Override
    public String toString() {
        return "CYlinder Base is a Circle"+"["+"Center"+"(" + getX() + "," + getY() + ") ,"+"radius ="+getRadius()+"color="+getColor()+"] ,"+"Cylinder Height ="+getHeight();
    }
}
public class Maindriver {

    public static void main(String[] args) {
	    Point2D p;
        p=new Circle(2,3,12.0,"blue");
        System.out.println("Circle : " + p.toString());
        p=new Cylinder(2,5,12.0,"redc",12.8);
        System.out.println("Cylinder : " + p.toString());
        
        
    }
}