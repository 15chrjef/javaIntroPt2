import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("What is your full name");

		String fullName = in.nextLine();

		System.out.println("What is your age");

		int age = in.nextInt();

		System.out.println("Your name is " + fullName);
		System.out.println("Your age is " + age);
	}
}