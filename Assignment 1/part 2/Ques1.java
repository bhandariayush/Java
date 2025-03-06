package part2;
import java.util.Scanner;
public class Ques1 {

	public static void main(String[] args) {
		int x;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number: ");
		x = in.nextInt();
		in.close();
		for(int i=0; i<x; i++) {
			int count = 1;
			for(int p=x; p>i+1; p--) {
				System.out.print(" ");
			}
			for(int j=0; j<i+1; j++) {
				System.out.print(count);
				count++;
			}
			for(int k=0; k<i+1; k++) {
				if(k==0) {
					count--;
					continue;
				}
				count--;
				System.out.print(count);
			}
			System.out.println();
		}

	}

}