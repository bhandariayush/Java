package part1;
import java.util.Scanner;
public class Ques9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int n = in.nextInt();
		in.close();
		for(int i=0; i<n; i++) {
			for(int j=n; j>i+1; j--) { // spaces
				System.out.print(" ");
			}
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}