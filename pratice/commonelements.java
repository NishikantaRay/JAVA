import java.util.Scanner;
public class commonelements {
    public static void main(String args[])
    {
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the 1st array");
        int length1=sc.nextInt();
        int []arr1=new int[length1];
        System.out.println("Enter the length of the 2nd array");
        int length2=sc.nextInt();
        int []arr2=new int[length2];
        System.out.println("Enter the elements of the 1st array");
        for(i=0;i<length1;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the elements of the 2nd array");
        for(i=0;i<length2;i++)
        {
            arr2[i]=sc.nextInt();
        }
        System.out.println("Common elements aree---");
        for(i=0;i<length1;i++)
        {
            for(j=0;j<length2;j++)
            {
                if(arr1[i]==arr2[j])
                {
                    System.out.print(arr1[i]+"\t");
                }
            }
        }

    }
}
