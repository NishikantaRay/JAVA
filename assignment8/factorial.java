// factorial class package
package mypackage;
public class factorial{
    int no,fact=1;
    public factorial(int no){
        this.no=no;
    }
    public int facto(){
        for(int i=1;i<no;i++){
            fact =no*fact;
        }
        return fact;
    }
}
// package end