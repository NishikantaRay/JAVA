import java.util.Scanner;

class fact{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a Number ");
        int n = sc.nextInt();
        float sum=1;
        for(int i=1; i<=n; i++){
            sum=sum*i;
        }
        System.out.println("Fact is"+sum);
        sc.close();
    }
}