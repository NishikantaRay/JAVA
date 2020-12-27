class timerde{
    int h,m,s;
    timerde(int h, int m,int s){
     this.h = h;
     this.m = m;
     this.s=s;
    }
    timerde(){}
    timerde sum(timerde c1, timerde c2) {
        timerde temp = new timerde();
        temp.h = c1.h + c2.h;
        temp.m = c1.m + c2.m;
        temp.s =c1.s + c2.s;
        return temp;
    }
    void  display(){  
     System.out.printf("Sum of time  is:(HH/MM/SS) "+ h+":"+ m +":"+s);
    }
}
class time{
    public static void main(String args[]) {
        timerde c1 = new timerde(4,4,4);
        timerde c2 = new timerde(5, 4,8);
        timerde temp = new timerde();
        temp=temp.sum(c1, c2);
        temp.display();
     }
 }