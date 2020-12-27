import java.util.Scanner;

class student{
    int roll;
    int marks[]= new int[5];
    String name;
    double avg;
    void getData(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your Name:");
        name =sc.nextLine();
        System.out.println("Enter your Roll no:");
        roll=sc.nextInt();
        System.out.println("Enter your 5 Marks One by one");
        for(int i=0;i<5;i++)
            marks[i]=sc.nextInt();
    }
    double avgmark(){
        double sum=0;
        for(int i=0;i<5;i++){
            sum+=marks[i];
        }
        return sum;
    }
    void print(){
        System.out.println("Details of Student:");
        System.out.println("Name: "+name);
        System.out.println("Roll no: "+roll);
        System.out.println("MArks:");
        for(int i=0;i<5;i++)
            System.out.print("Mark "+(i+1)+" -- "+marks[i]);
        System.out.println("Avrage Mark: "+avgmark());
    }


}
class studentmark{
    public static void main(String args[]){
        student s1=new student();
        s1.getData();
        s1.print();
    }
    

}