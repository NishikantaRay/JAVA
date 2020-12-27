class Time{
    int hour,minute,second;
    Time(int h, int m,int s){
     this.hour = h;
     this.minute = m;
     this.second=s;
    }
    Time(){}
    void addTIme(Time c1,Time c2) {
        this.hour = c1.hour + c2.hour;
        this.minute = c1.minute + c2.minute;
        this.second =c1.second + c2.second;

    }
    void  displayTime(){  
     System.out.printf("Sum of time  is:(HH:MM:SS) "+ hour+":"+ minute +":"+second);
    }
}
class driverTime{
    public static void main(String args[]) {
        Time c1 = new Time(4,4,4);
        Time c2 = new Time(5,4,8);
        Time temp = new Time();
        temp.addTIme(c1, c2);
        temp.displayTime();
     }
 }