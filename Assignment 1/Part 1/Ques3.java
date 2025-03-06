package part1;
import java.util.Scanner;
import java.util.Stack;
public class Ques3 {

	public static void main(String[] args) {
		int num;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number: ");
		num = in.nextInt();
		in.close();
		int temp = num;
		Stack<Integer> s = new Stack<>();
		while(temp>0) {
			int rem = temp % 2;
			s.push(rem);
			temp /= 2;
		}
		System.out.print("Binary: ");
		while (!s.isEmpty()) {
			System.out.print(s.pop());
		}		
	}

}