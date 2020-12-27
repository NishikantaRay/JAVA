import java.util.Scanner;

class calculate{
    double totalamount;
    double amount;
    String Name,Accountno;
    calculate(){
        this.totalamount=0;
        this.amount=amount;
        this.Name=Name;
        this.Accountno=Accountno;
    }
    void bankdetails(){
        Scanner ac=new Scanner(System.in);
        System.out.println(" Enter your Name ");
        Name=ac.nextLine();
        System.out.println(" Enter your Account Number ");
        Accountno=ac.nextLine();
        System.out.println(" What is your next step? ");
        System.out.println(" 1.Deposite ");
        System.out.println(" 2.Withdraw ");
        System.out.println(" Enter your choice ");
        int no =ac.nextInt();
        if(no==1){
            System.out.println(" Enter your DepositeAmount");
            amount =ac.nextDouble();
            System.out.println(" Your total balance "+deposite(amount));
        }else{
            System.out.println(" Enter your WithdrawAmount");
            amount =ac.nextDouble();
            System.out.println(" Your total balance "+withdraw(amount));
        }
    }
    double deposite(double amount){
        totalamount+=amount;
        return totalamount;
    }
    double withdraw(double amount){
        totalamount-=amount;
        return totalamount;
    }
}
class bank extends calculate{
    void Sbi(){
        System.out.println(" Welcome to SBI ATM ");
        bankdetails();
    }
    void HDFC(){
        System.out.println(" Welcome to HDFC ATM ");
        bankdetails();
    }
    void ICIC(){
        System.out.println(" Welcome to ICIC ATM ");
        bankdetails();
    }
}
class drivermain{
    public static void main(String args[]){
        Scanner abc =new Scanner(System.in);
        bank a=new bank();
        System.out.println(" Enter Your Bank Name(Choose the Bank id) From the list ");
        System.out.println(" 1.SBI ");
        System.out.println(" 2.ICIC");
        System.out.println(" 3.HDFC ");
        int Bankname=abc.nextInt();
        if(Bankname==1){
            a.Sbi();
        }else if(Bankname==2){
            a.ICIC();
        }else{
            a.HDFC();
        }
    }
}