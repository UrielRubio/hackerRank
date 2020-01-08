package daysOfStatistics10;
import java.io.*;
import java.util.*;

public class permutationAndCombination {
	static  Scanner scan = new Scanner(System.in);
	static int i;
	public static long factorial(long n) {
		if(n==1)
			return 1;
		else {
			return factorial(n-1)*n;
		}
	}
	private static int menu() {
		System.out.println("MENU\n1.-Permutation\n2.-Combination\nOther number to exit");
		return scan.nextInt();
	} 
	private static void permutation(int n, int r) {
		System.out.println("Permutation result is " + factorial(n)/factorial(n-r));
	}
	private static void combination(int n, int r) {
		System.out.println("Combination result is " + factorial(n)/(factorial(r)*factorial(n-r)));
		System.out.println("Combination result is " + factorial(n));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int option, n, r;
		option = menu();
		do {
			
			switch(option) {
			case 1:
				System.out.println("Give n and r separated by space");
				n = scan.nextInt();
				r = scan.nextInt();
				permutation(n, r);
				break;
			case 2:
				System.out.println("Give n and r separated by space");
				n = scan.nextInt();
				r = scan.nextInt();
				combination(n, r);
				break;
			default:
				System.out.println("Bye....");
				break;
			}
			option = menu();
		}while(option==1 || option==2);
	}

}
