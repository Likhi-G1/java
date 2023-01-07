import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		System.out.println("Enter number of days");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = x/7;
		int z = x%7;
	    System.out.println("number of weeks are " + y);
	    System.out.println("number of days are " + z);
		
		

	}

}
