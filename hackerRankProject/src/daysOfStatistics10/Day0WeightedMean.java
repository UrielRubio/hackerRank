package daysOfStatistics10;
import java.io.*;
import java.util.Scanner;
import java.math.*;
import java.text.DecimalFormat;;


public class Day0WeightedMean {
	static int i;
	private static double round(double value, int precision) {
	    int scale = (int) Math.pow(10, precision);
	    return (double) Math.round(value * scale) / scale;
	}
	static void weightedMean(int N, int[] X, int[] W) {
		double sumW=0.0, sumXW=0.0;
		for(i=0; i<N; i++) {
			sumXW += X[i]*W[i];
			sumW += W[i];
		}
		double res = round(sumXW/sumW, 1);
		System.out.println(res);
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] X = new int[N], W = new int[N];
		for(i=0; i<N; i++) {
			X[i] = scan.nextInt();
		}
		for(i=0; i<N; i++) {
			W[i] = scan.nextInt();
		}
		scan.close();
		weightedMean( N, X, W);
	}

}
 
/*
10

10 40 30 50 20 10 40 30 50 20

1 2 3 4 5 6 7 8 9 10 5552262663 4 3
*/