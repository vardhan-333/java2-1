package work;
import java.util.Scanner;
public class ElectricBill {
	public static void main(String args[]) {
		Bill eb=new Bill();
		eb.accept();
		eb.calculate();
		eb.print();
	}
}
class Bill{
	static Scanner sc=new Scanner(System.in);
	static String n;
	static int units;
	static float bill;	
	void accept() {
		System.out.println("enter name:");
		n=sc.nextLine();
		System.out.println("enter no of units");
		units=sc.nextInt();
	}
	void calculate() {
		if(units<=100) {
			bill=units*2.00f;
		}
		else if(units>100 && units<=300) {
			bill=units*3.00f;
		}
		else {
			bill=units*5.00f;
			float charge=((bill/100)*2.5f);
			bill+=charge;
		}
	}
	void print() {
		System.out.println("Name of the customer:"+n);
		System.out.println("Number of units consumed:"+units);
		System.out.println("Bill amount:"+bill);	
	}
}
