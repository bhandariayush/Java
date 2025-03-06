package part1;
import java.util.Scanner;
public class Ques6 {

	public static void main(String[] args) {
		float p, rate, time, si;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the principle amount: ");
		p = in.nextFloat();
		System.out.print("Enter the rate: ");
		rate = in.nextFloat();
		System.out.print("Enter the time period: ");
		time = in.nextFloat();
		si = (p*rate*time)/100;
		in.close();
		System.out.println("The simple interest is " + si);
	}

}