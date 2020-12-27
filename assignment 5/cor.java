import java.util.Scanner;
class cord {
    double x1,y1;
    cord(cord c1,cord c2){
        double dx = c2.x1 - c1.x1;
        double dy = c2.y1 - c1.y1;
        System.out.println(Math.sqrt(dx * dx + dy * dy));
    }
    cord(double x1,double y1){
        this.x1=x1;
        this.y1=y1;
    }
    cord(double x1){
        this.x1=x1;
    }
    cord(cord c1,cord c2,cord c3){
        if((c1.x1+c2.x1)>c3.x1&&(c1.x1+c3.x1)>c2.x1&&(c2.x1+c3.x1)>c1.x1){
            System.out.println("Triangle");

        }else{
            System.out.println("Not a Triangle");
        }
    }
}
class cor{
    public static void main(String[] args) {
        cord p1 = new cord(2.3,2.3);
        cord p2 =new cord(2.4,3.3);
        cord p3 =new cord(p1,p2);
        cord p6 =new cord(2.2);
        cord p7 =new cord(3.2);
        cord p8 =new cord(3.5);
        cord p5 =new cord(p6,p7,p8);
    }
} 