package commonProgram;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		int sum = 1;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number for factorial : ");
		int num = in.nextInt();
		for (int i = 1; i <= num; i++) {
			sum = sum * i;
		}

		System.out.println(sum);

	}

}
