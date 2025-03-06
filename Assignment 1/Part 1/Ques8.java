// Write a Program to Find Sum of Fibonacci Series Number
package part1;
import java.util.Scanner;
public class Ques8 {

	public static void main(String[] args) {
		int num;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of terms: ");
		num = in.nextInt();
		in.close();
		int n = 0;
		int sum = 1;
		int output;
		int final_sum = 1;
		if(num >= 1) {
			System.out.print(0 + " ");
		}
		if(num >= 2) {
			System.out.print(1 + " ");
		}
		for(int i=2; i<num; i++) {
			output = n + sum;
			System.out.print(output + " ");
			n = sum;
			sum = output;
			final_sum += output;
		}
		System.out.println();
		System.out.print("The sum is " + final_sum);
	}

}
