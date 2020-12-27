import java.util.Scanner;

class cal{
    public static void main(String args[]){
       

        Scanner sc = new Scanner(System.in);
        int sum =0;
        int n1,n2;
        System.out.println(" Enter 1st number ");
        n1=sc.nextInt();
        System.out.println(" Enter 2nd number ");
        n2=sc.nextInt();
        System.out.println(" 1:Addition ");
        System.out.println(" 2:Substarction ");
        System.out.println(" 3:Mutiplication ");
        System.out.println(" 4:Divide ");
        System.out.println(" Choose from Above ");
        int n = sc.nextInt();
        switch(n)
        {
            case 1:
             sum=n1+n2;
             break;
             case 2:
             sum=n1-n2;
             break;
             case 3:
             sum=n1*n2;
             break;
             case 4:
             sum=n1/n2;
             break;
             default:
             System.out.println(" You enter a wrong one ");
             break;

        }
        System.out.println(" ans "+sum);
        sc.close();

    }
}