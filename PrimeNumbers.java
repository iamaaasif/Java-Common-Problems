

import java.util.Scanner;
/**
 * @author Abdullah Al Asif
 *
 */
public class PrimeNumbers extends PrimeNumberCheck {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number , untill you want to show prime number : ");
		int num = scanner.nextInt();
		int count = 0;
		for (int i = 2; i < num; i++) {
			if (isPrimeCheck(i)) {
				count++;
				System.out.print(i + " ");
			}

		}
		System.out.println();
		System.out.println("Total prime number untill " + num + " is " + count);

	}

}
