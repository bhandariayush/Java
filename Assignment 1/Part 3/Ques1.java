//Java Array Program For Array Rotation
package part3;
import java.util.Arrays;
import java.util.Scanner;
public class Ques1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = 6;
		System.out.print("Enter the index number: ");
		int id = in.nextInt();
		in.close();
		int[] num = {1,2,3,4,5,6};
		int[] arr = new int[n];
		int count =0;
		for(int i=id;i<n;i++) {
			arr[count] = num[i];
			count++;
		}
		for(int i=0;i<id;i++) {
			arr[count]=num[i];
			count++;
		}
		System.out.println("The array is "+ Arrays.toString(num));
		System.out.println("The array is "+ Arrays.toString(arr));
	}
}