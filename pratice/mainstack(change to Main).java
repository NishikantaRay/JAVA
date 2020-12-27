import java.util.Scanner;
class stackimplementation {
    private int[]array=new int[10];
    private int top=-1;

    public void push(int element)
    {
        if(top<10)
        {
            top++;
            array[top]=element;
        }
        else
        System.out.println("Stack overflow");
    }
    public int pop()
    {
        if(top>-1)
        {
            int element=array[top];
            top--;
            return element;
        }
        else
        System.out.println("Stack is empty");
        return -1;
    }
    public void display()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
            return;
        }
        for(int i=top;i>=0;i--)
        System.out.println(array[i]);
    }
}
public class Main{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        stackimplementation stack=new stackimplementation();
        int ch,element;
        while(true){
            System.out.println("1.Push Operation");
            System.out.println("2.Pop Operation");
            System.out.println("3.Display");
            System.out.println("4.Exit");
            System.out.println("Enter ur choice :");
            ch=sc.nextInt();
            switch(ch){
                case 1:
                System.out.println("Enter the element");
                element=sc.nextInt();
                stack.push(element);
                break;
                case 2:
                System.out.println("Pop element is "+stack.pop());
                
                break;
                case 3:
                stack.display();
                break;
                case 4:
                System.exit(0);
                default:
                System.out.println("Invalid input");
                break;

            }
        }
    }
}
