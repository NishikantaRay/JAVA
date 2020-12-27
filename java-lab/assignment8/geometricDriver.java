abstract class GeometricFigure{
    int dim1,dim2;
    GeometricFigure(int dim1,int dim2){
        this.dim1=dim1;
        this.dim2=dim2;
    }
    abstract double getArea();
}
class Rectangle extends GeometricFigure{
    Rectangle(int dim1, int dim2) {
        super(dim1, dim2);
    }

    @Override
    public double getArea() {
        return dim1*dim2;
    }
}
class Triangle extends GeometricFigure{
    Triangle(int dim1, int dim2) {
        super(dim1, dim2);
    }

    @Override
    public double getArea() {
        return 0.5*dim1*dim2;
    }
}
public class geometricDriver {
    public static void main(String args[]) {
        GeometricFigure g1;
        g1=new Rectangle(5, 6);
        System.out.println(" Area of Rectangle "+g1.getArea());
        g1=new Triangle(3, 2);
        System.out.println(" Area of Triangle "+g1.getArea());
    }
}
