import java.util.Scanner;
import java.util.Arrays;

class ele{
    public static void main(String[] args) {
       
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the range");
        int n = sc.nextInt();
        int[] data = new int[n];
        System.out.println("Enter the array value");
        for(int i=0;i<n;i++){
           data[i]=sc.nextInt();
        }
        System.out.println("1.Display Number ");
        System.out.println("2.Insert New Element ");
        System.out.println("3.Insert A New Element at ith position ");
        System.out.println("4.Delete at ith position ");
        System.out.println("5.Exit ");
        System.out.println("Enter your choice");
        int ch = sc.nextInt();
        switch(ch){
            case 1:
            System.out.println("ARRAY VALUES ARE---");
            for(int i=0;i<n;i++){
                System.out.println(data[i]);
             }
            break;
            case 2:
            System.out.print("Enter the element you want to insert:");
            int y = sc.nextInt();
            int newarr[] = new int[n + 1]; 
            for (int i = 0; i < n; i++) 
                newarr[i] = data[i]; 
            newarr[n] = y;
            System.out.print("After inserting:");
            for(int i = 0; i < n; i++)
            {
                System.out.print(newarr[i]+",");
            }
            System.out.print(newarr[n]);
            break;
            case 3:
            int[] newdata = new int[n+1];
            System.out.print("Enter the position where you want to insert element:");
            int pos = sc.nextInt();
            System.out.print("Enter the element you want to insert:");
            int x = sc.nextInt();
            for(int i = (n-1); i >= (pos-1); i--)
            {
               newdata[i+1] = data[i];
               
            }
            newdata[pos-1] = x;
            System.out.print("After inserting:");
            for(int i = 0; i < n; i++)
            {
                System.out.print(newdata[i]+",");
            }
            System.out.print(newdata[n]);
            break;
            case 4:
            System.out.print("Enter the position where you want to delete element:");
            int index = sc.nextInt();
            System.out.println("Original Array : "+Arrays.toString(data));    
            for(int i = index; i < data.length -1; i++){
               data[i] = data[i + 1];
            }
            for(int i = 0; i < n-1; i++)
            {
                System.out.print(data[i]+",");
            }
            break;
            default:
            System.out.println("Wrong choice");
        }
        sc.close();  
       }
}
