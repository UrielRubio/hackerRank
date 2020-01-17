package DaysofCode30;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Difference {
	private int[] elements;
	public int maximumDifference = 0;

	// Add your code here
	Difference(int[] elements) {
		this.elements = elements;
	}

	void computeDifference() {
		for(int i = 0; i < this.elements.length; i++ )
			for(int j = 0; j < this.elements.length; j++)
				if(i!=j) {
					if (Math.abs(this.elements[i] - this.elements[j]) > this.maximumDifference)
						this.maximumDifference = Math.abs(this.elements[i] - this.elements[j]);
					
				}
	}
} // End of Difference class

public class Day14Scope {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		Difference difference = new Difference(a);

		difference.computeDifference();

		System.out.print(difference.maximumDifference);
	}
}

/*
3
1 2 5
 
 */
