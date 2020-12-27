import java.util.Scanner;

class Per 
{ 
    static int pan_no; 
    String name,address;
    Per(){}
    Per(int a, String b, String c)
	{
		pan_no = a;
		name = b;
		address = c;
	}
    static void pan_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Pan_no");
        pan_no = sc.nextInt();
    }

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        name = sc.nextLine();
        System.out.println("enter Address");
        address = sc.nextLine();
        pan_details();
    }
}
class person {
    public static void main(String[] args) 
    {  
        Per[] arr;  
        arr = new Per[3]; 
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = new Per();
        }
        for(int i=0;i<arr.length;i++)
        {
            arr[i].getData();
        }
        
        for (int i = 0; i < arr.length; i++) 
            System.out.println("person at " + i + " : " + "Pan no-"+
                        Per.pan_no + " " + "Name-" + arr[i].name + "  " + "Address-" + arr[i].address + " ");
         
    } 
} 
