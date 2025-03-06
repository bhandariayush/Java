package part1;

public class Ques5 {

	public static void main(String[] args) {
		int num1_real = 12;
		int num1_img = -6;	//the number is 12+3i
		int num2_real = 12;
		int num2_img = -3;	//the number is 13+2i
		int sum_real = num1_real + num2_real;
		int sum_img = num1_img + num2_img;
		String s1,s2,s3;
		s1 = num1_img>=0?" + ":" - "; //for handling negative values
		s2 = num2_img>=0?" + ":" - ";
		s3 = sum_img>=0?" + ":" - ";
		System.out.println("The sum of two complex numbers");
		System.out.println(num1_real + s1 + Math.abs(num1_img) +"i"+ " and "+ num2_real + s2 + Math.abs(num2_img) +"i"+ " is ");
		System.out.println(sum_real + s3 + Math.abs(sum_img) +"i");
	}

}