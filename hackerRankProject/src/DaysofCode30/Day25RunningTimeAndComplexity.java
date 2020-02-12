package DaysofCode30;

import java.util.Scanner;

public class Day25RunningTimeAndComplexity {
	private static void isPrime(int num) {
		boolean prime = true; 
		if(num==1)
			prime = false;
		else if(num == 2)
			prime = true;
		else 
			for(int i=2; i<=Math.sqrt(num); i++) 
				if(num % i == 0) {
					prime = false;
					break;
				}
		
		if(!prime)
			System.out.println("Not prime");
		else 
			System.out.println("Prime");
	}
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while(T-->0) {
			isPrime(in.nextInt());
		}
	}

}
