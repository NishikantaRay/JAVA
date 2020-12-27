class Point{
	int Xco,Yco;
	Point(int x,int y){
		this.Xco=x;
		this.Yco=y;
	}
	double distance(Point p1,Point p2){
		double dis;
		dis=Math.sqrt((p2.Xco-p1.Xco)*(p2.Xco-p1.Xco) + (p2.Yco-p1.Yco)*(p2.Yco-p1.Yco));
		return dis;
	}
	void isTriangle(Point p1,Point p2,Point p3){
		double a=distance(p1,p2);
		double b=distance(p2,p3);
		double c=distance(p3,p1);
		if((a+b)>c&&(b+c)>a&&(a+c)>b)
			System.out.println("Valid triangle");
		else
			System.out.println("Not a Valid triangle");
	}
}
class Triangle{		
	public static void main(String arg[]){
		Point P1=new Point(10,6);
		Point P2=new Point(15,7);
		Point P3=new Point(5,8);
		Point P5=new Point(25,77);
		P5.isTriangle(P1,P2,P3);
    }
}