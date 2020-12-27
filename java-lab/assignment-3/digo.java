import java.util.Scanner;
public class digo {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println(" Enter the row and column ");
      int r =sc.nextInt();
      int c =sc.nextInt();
      int [][] arr=new int[r][c];
      System.out.println(" Enter the value of matrix ");
      for(int i =0;i<r;i++)
      {
          for(int j=0;j<c;j++){
              arr[i][j]=sc.nextInt();
          }
      }
      System.out.println(" VALUE OF DIGONAL ELEMENT ");
      for(int i =0;i<r;i++)
      {
          for(int j=0;j<c;j++){
              if(i==j)
              {
                System.out.print(arr[i][j]+"\t"); 
              }
          }
      }


      sc.close();  
    }
}
