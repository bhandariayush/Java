package part1;
import java.util.Scanner;
public class Ques2 {

	public static void main(String[] args) {
		int x,y;
		Scanner n = new Scanner(System.in);
		System.out.print("Enter first number: ");
		x = n.nextInt();		
		System.out.print("Enter second number: ");
		y = n.nextInt();
		n.close();
		System.out.print("The sum of " + x + " and " + y + " is " + (x+y));
	}

}
