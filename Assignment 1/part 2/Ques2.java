package part2;
import java.util.Scanner;
import java.util.Arrays;
public class Ques2 {
	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		n = in.nextInt();
		int sum = 0;
		int[] num = new int[n];
		System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            num[i] = in.nextInt();
            sum += num[i];
        }
		in.close();
		System.out.println("The array is "+ Arrays.toString(num));
        System.out.println("The sum of array: " + sum);
	}
}