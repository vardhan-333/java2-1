package work;
import java.util.Scanner;
public class Check {
	static void check(String str,char ch) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==ch) {
				count+=1;
			}
		}
		System.out.println("no of '"+ch+"' in string are :"+count);
	}
	static void check(String s1) {
		s1=s1.toLowerCase();
		System.out.println("the vowels in string are:");
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u') {
				System.out.print(s1.charAt(i)+" ");
			}
		}
	}
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string str:");
		String str=sc.nextLine();
		System.out.println("enter string s1:");
		String s1=sc.nextLine();
		System.out.println("character to find:");
		char ch=sc.next().charAt(0);
		//Scanner sc=new Scanner(System.in);
		//str=sc.nextLine();
		//s1=sc.nextLine();
		//ch=sc.next();
		check(str,ch);
		check(s1);
	}
}
