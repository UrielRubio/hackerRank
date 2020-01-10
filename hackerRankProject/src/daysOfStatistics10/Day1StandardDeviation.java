package daysOfStatistics10;
import java.io.*;
import java.util.*;
import java.math.*;
public class Day1StandardDeviation {
	static int i;
	private static double round(double value, int precision) {
	    int scale = (int) Math.pow(10, precision);
	    return (double) Math.round(value * scale) / scale;
	}
	static void standardDeviation(int N, int[] X) {
		//Mean
		 double mean=0.0;
		 for(i=0; i<N; i++)
			 mean += X[i];
		 mean = mean/N;
		 //System.out.println(mean);
		 //standar deviation
		 double sd = 0.0;
		 for(i=0; i<N; i++)
			 sd += (X[i]-mean)*(X[i]-mean);
		 sd = round(Math.sqrt(sd/N), 1);
		 System.out.println(sd);
		
	}
	
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	 Scanner scan = new Scanner(System.in);
	 int N = scan.nextInt();
	 int[] X = new int[N];
	 for(int i=0; i<N; i++) {
		 X[i] = scan.nextInt();
	 }
	 standardDeviation(N, X);
  }
}
