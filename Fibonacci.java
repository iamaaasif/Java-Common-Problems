import java.util.Scanner;

/**
 * @author Abdullah Al Asif
 *
 */
public class Fibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How Many fibonacci number you want to show ? :");
		int number = scanner.nextInt();
		// 0 1 1 2 3 5 8 13 21
		int i = 0;
		int j = 1;
		int k = 0;
		// if you want number fibonacci series
		System.out.print(i + " " + j);
		for (int k2 = 1; k2 <= number - 2; k2++) {
			k = i + j;
			System.out.print(" " + k);
			i = j;
			j = k;

		}

		

	}

}
