package work;
import java.util.Scanner;

public class Bankmain {
	    static float balance=0.0f;
		float deposit;
		float withdraw;
	    static String name;
		static Scanner sc=new Scanner(System.in);
		static void Deposit(float amount) {
			balance+=amount;
			System.out.println(amount +" deposited to ur account");
			System.out.println("current balance :"+balance);
		}
		static void Display() {
			System.out.println("name:"+name);
			System.out.println("balance:"+balance);
		}
		static void Withdraw(float amount) {
			if(balance<amount) {
				System.out.println("your balance is not sufficient to withdraw");
			}
			else {
				balance-=amount;
				System.out.println(amount+" withdrawes from yr account");
				System.out.println("current balance :"+balance);
			}
		}
	public static void main(String args[]) {
	
		System.out.println("enter or assign intital values:");
		System.out.println("enter name:");
		name=sc.nextLine();
		System.out.println("enter balance:");
		balance=sc.nextFloat();	
		System.out.println("enter 1:deposit , 2:withdraw ,3:current balance");
		int choice=sc.nextInt();
		if(choice==1) {
			System.out.println("enter amount to deposit:");
			float amount =sc.nextFloat();
			Deposit(amount);
		}
		else if(choice==2) {
			System.out.println("enter amount to withdraw:");
			float amount =sc.nextFloat();
			Withdraw(amount);
		}
		else if(choice==3){
			Display();
		}
		else {
			System.out.println(choice+" not mentioned or invalid.");
		}
	}
}
