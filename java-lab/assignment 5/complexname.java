class complex{
    double real, img;
    complex(double r, double i){
     real = r;
     img = i;
    }
    complex(){}
    complex sum(complex c1, complex c2) {
        complex temp = new complex();
        temp.real = c1.real + c2.real;
        temp.img = c1.img + c2.img;
        return temp;
    }
    void  display(){  
     System.out.printf("Sum is: "+ real+" + "+ img +"i");
    }
}
class complexname{
    public static void main(String args[]) {
        complex c1 = new complex(5.5, 4);
        complex c2 = new complex(1.2, 3.5);
        complex temp = new complex(); 
        temp=temp.sum(c1, c2);
        temp.display();
     }
 }