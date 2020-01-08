package DaysofCode30;
import java.io.*;
import java.util.*;
public class Day6LetsReview {
	static Scanner scan = new Scanner(System.in);
	static int i;
	static void evenOddIndices(String cadena) {
		String even = "", odd = "";
		for(i=0; i<cadena.length(); i++) {
			if(i%2==0)
				even += cadena.substring(i, i+1);
			else
				odd += cadena.substring(i, i+1);
		}
		System.out.println(even + " " + odd);
	}
	public static void main(String args[]) {
		int T = scan.nextInt();
		while(T>0) {
			evenOddIndices(scan.next());
			T -=1;
		}
	}
}
