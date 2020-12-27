class stackn {
    int arr[];
    int top;
    int size; 
    void push(int s)
    {
        if(top==size){
            System.out.println(" Overflow");
        }else{
            top++;
            arr[top]=s;
        }
    }
    int pop()
    {
        if(top<0){
            System.out.println(" Underflow ");
            return -1;
        }else{
            return arr[top--];
        }
    }
    stackn(int s){
        size=s;
        top=-1;
        arr=new int[size];
    }
    
}
class stack{
    public static void main(String args[]){
        stackn s=new stackn(10),s1=new stackn(5),s2=new stackn(6);
        for(int i=10;i>=1;i--){
            s.push(i);
        }
        for(int i=15;i>=11;i--){
            s1.push(i);
        }
        for(int i=25;i>=21;i--){
            s2.push(i);
        }
        System.out.println("Stack1");
        for(int i=0;i<10;i++){
            System.out.print(s.pop()+" ");
        }
        System.out.println();
        System.out.println("Stack2");
        for(int i=0;i<5;i++){
            System.out.print(s1.pop()+" ");
        }
        System.out.println();
        System.out.println("Stack3");
        for(int i=0;i<5;i++){
            System.out.print(s2.pop()+" ");
        }
    }
}
