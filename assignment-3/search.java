import java.util.Scanner;
public class search{
    public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
     System.out.println("Enter the range");
     int n = sc.nextInt();
     int[] data = new int[n];
     System.out.println("Enter the array value");
     for(int i=0;i<n;i++){
         data[i]=sc.nextInt();
     }
     System.out.println("ENTER THE value you want to search ");
     int num =sc.nextInt();
     sc.close();
     int i;
     for(i=0;i<n;i++)
     {
         if(data[i]==num){
            System.out.println(num + " Number is present "+ " at postion "+(i+1));
            break;
         }    
     }
     if(i==n){
      System.out.println(num + " Number is not  present ");
     }
   }
   
}