import java.util.Scanner;

class NewThread implements Runnable {
	Thread t;
	NewThread() {
		t = new Thread(this, "Demo Thread");
		System.out.println("Child thread: " + t);
		t.start(); 
	}

	public void run() {
		try {
			System.out.println("The even numbers in a range printed by Child thread ");
			for(int i = 1; i <=10; i++) {
				if(i%2==0){
					System.out.println("Child Thread: " + i);
					Thread.sleep(100);
				}
				
			}
			System.out.println("The number table of user input number printed by main thread ");
			} 
		catch (InterruptedException e) {
			System.out.println("Child interrupted.");
			}
	}
}
public class Threaddemo {
	public static void main(String args[ ] ) {
		new NewThread();
		
		
		try {
			Thread.sleep(1000);
			Scanner ac=new Scanner(System.in);
			System.out.println("Enter your number");
			
		int n=ac.nextInt();
		 for(int i=1; i <= 10; i++)
        {
			Thread.sleep(5000);
            System.out.println(n+" * "+i+" = "+n*i);
			
		}
		}
		catch (InterruptedException e) {
			System.out.println("Main thread interrupted.");
			}
		
	}
}