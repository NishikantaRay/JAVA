class Shape{
    void draw(){
        System.out.println("Drawing shape");
    }
    void erase(){
        System.out.println("Erasing shape");
    }
}
class Triangle extends Shape{
    void draw(){
        System.out.println("Drawing Triangle");
    }
    void erase(){
        System.out.println("Erasing Triangle");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Drawing circle");
    }
    void erase(){
        System.out.println("Erasing Circle");
    }
}
class Square extends Shape{
    void draw(){
        System.out.println("Drawing Square");
    }
    void erase(){
        System.out.println("Erasing Square");
    }
}

class Driverclass{
    public static void main(String args[]){
        Shape ob;
        ob=new Triangle();
        ob.draw();
        ob.erase();
        ob=new Square();
        ob.draw();
        ob.erase();
        ob=new Circle();
        ob.draw();
        ob.erase();
    }
}