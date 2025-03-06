package part1;
import java.util.Scanner;
public class Ques4 {

	public static void main(String[] args) {
		int num;
		System.out.print("Enter the number: ");
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		in.close();
		int fac=1;
		for(int i=1; i<num+1; i++) {
			fac *= i;
		}
		System.out.println("Factorial of " + num + " is " + fac);
	}

}