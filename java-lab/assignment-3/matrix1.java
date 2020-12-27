import java.util.Scanner;
class matrix1{
    public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
     System.out.println("Enter the row and col");
     int r = sc.nextInt();
     int c = sc.nextInt();
    
     int[][] data = new int[r][c];
     System.out.println("Enter the matrix value");
     for(int i=0;i<r;i++)
     {
         for(int j=0;j<c;j++)
            data[i][j]=sc.nextInt();

     }
     int sum= 0;
     for(int i=0;i<r;i++)
     {
        for(int j=0;j<c;j++)
        {
            sum+= data[i][j];

        }

     }
     System.out.println("matrix summ" +sum);
    

     sc.close();  
    }
}