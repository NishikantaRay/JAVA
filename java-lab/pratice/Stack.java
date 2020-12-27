import java.util.Scanner;

class stackdemo {
    int top;
    void create(int arr[],int s)
    {
        Scanner ac =new Scanner(System.in);
        System.out.println(" Enter Values of ARRAy");

        for(int i=0;i<s;i++)
        {
            arr[i]=ac.nextInt();

        }
        ac.close();
        
    }
    void print(int arr[],int s){
        System.out.println(" Values Are ");
        for(int i=0;i<s;i++)
        {
            System.out.println(arr[i]);

        }
    }
    void push(int arr[],int s,int item)
    {
        if(top==s-1){
            System.out.println(" Overflow");
        }else{
            top++;
            arr[top]=item;
        }
    }
    int pop(int arr[],int s)
    {
        if(top<0){
            System.out.println(" Underflow ");
            return -1;
        }else{
            top--;
            return arr[top];
        }
    }
    stackdemo(){
        top=-1;
    }
    
}

class Stack{
    public static void main(String args[]) {
        
       int num;
        System.out.println(" Enter Size ");
        Scanner ac =new Scanner(System.in);
        int s =ac.nextInt();
        int arr[]= new int[s];
        stackdemo s1 =new stackdemo();
        
        do {
            System.out.println("5) Create an Array ");
            System.out.println("1) Push in stack ");
            System.out.println("2) Pop from stack");
            System.out.println("3) Display stack ");
            System.out.println("4) Exit");
            System.out.println("Enter choice: ");
            int ch=ac.nextInt();
           
            switch(ch) {
                case 1: {
                    System.out.println("Enter value to be pushed:");
                    int val=ac.nextInt();
                    s1.push(arr,s,val);
                    break;
                }
                case 2: {
                    System.out.println("POp value:--"+s1.pop(arr, s));
                    break;
                }
                case 3: {
                    s1.print(arr,s);
                    break;
                }
                case 4: {
                    System.out.println("Exit ");
                    break;
                }
                case 5:{
                    s1.create(arr, s);
                }
                default: {
                    System.out.println(" Invalid Choice ");
                }
            }
            System.out.println(" Enter 0 for close and 1 for continue");
            num=ac.nextInt();
        }while(num != 0);
        ac.close();
       
    }
}

