import java.util.Scanner;
public class sort{
    public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
     System.out.println("Enter the range");
     int n = sc.nextInt();
     int[] data = new int[n];
     System.out.println("Enter the array value");
     for(int i=0;i<n;i++)
         data[i]=sc.nextInt();
     sc.close();
     for(int i=0;i<n;i++)
     {
         for(int j=i+1;j<n;j++)
         {
            if(data[i]>data[j]){
                int temp =data[i];
                data[i]=data[j];
                data[j]=temp;
            }    
         }
         
     }
     System.out.println("SORTING IN ASSENDING ORDER--- ");
     for(int i=0;i<n-1;i++){
       System.out.println(data[i]);
    }
    System.out.println(data[n-1]);
   }
   
}