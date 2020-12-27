import java.util.Scanner;

class week{
    public static void main(String args[]){
       

        Scanner sc = new Scanner(System.in);
        System.out.println(" 1:Monday ");
        System.out.println(" 2:Tuesday ");
        System.out.println(" 3:Wed ");
        System.out.println(" 4:Thus ");
        System.out.println(" 5:Fri ");
        System.out.println(" 6:sat ");
        System.out.println(" 7:sat ");
        System.out.println(" Choose from Above ");
        int n = sc.nextInt();
        switch(n)
        {
            case 1:
            System.out.println(" 1:Monday ");
             break;
             case 2:
             System.out.println(" 2:Tuesday ");
             break;
             case 3:
             System.out.println(" 3:Wed ");
             break;
             case 4:
             System.out.println(" 4:Thus ");
             break;
             case 5:
             System.out.println(" 5:Fri ");
              break;
              case 6:
              System.out.println(" 6:Sat ");
              break;
              case 7:
              System.out.println(" 3:Sunday ");
              break;
             default:
             System.out.println(" You enter a wrong one ");
             break;

        }
        
        sc.close();

    }
}