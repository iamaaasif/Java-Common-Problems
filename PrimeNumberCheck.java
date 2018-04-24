

import java.util.Scanner;
/**
 * @author Abdullah Al Asif
 *
 */
public class PrimeNumberCheck {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		if (isPrimeCheck(number)) {
			System.out.println(number+" is prime");
		}
		else {
			System.out.println(number+" is not prime");
		}
		

	}//prime number means that number only divided by this number 
	//5
	public static boolean isPrimeCheck(int number) {
		for(int i=2;i<number;i++)
		{
			if (number%i==0) {
				return false;
			}
		}
		return true;
		
		
		
	}

}
