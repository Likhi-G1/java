import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		String name;
		String id;
		int account;
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name"+ "id"+ "account");
		name=sc.next();
		id=sc.next();
		account=sc.nextInt();
		int balance=50000;
		System.out.println("enter amount to withdraw");
		int a1 = sc.nextInt();
		
		String m1="if withdraw" + " "+balance+ " "+ "leave balance it as";
		String m2="if withdraw" + " "+balance +" "+ "then update your balance ";
		String result=(a1>balance)? m1:m2;
		System.out.println("result");
		
		
		
		
	}

}
