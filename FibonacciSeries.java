import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("fibonacci series untill number you want show? :");
		int number = scanner.nextInt();

		int i = 0;
		int j = 1;
		int k = 0;

		System.out.print(i + " " + j);
		while (k < number) {
			k = i + j;
			i = j;
			j = k;
			System.out.print(" " + k);
		}
	}
}
