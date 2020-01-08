package daysOfStatistics10;
import java.io.*;
import java.util.Scanner;
public class Day1InterquartileRange {
	static int i;
	private static double round(double value, int precision) {
	    int scale = (int) Math.pow(10, precision);
	    return (double) Math.round(value * scale) / scale;
	}
	static int[] ordenamientoBurbuja(int N, int[] X) {
		int aux, i, iteracion;
		for(iteracion=0; iteracion<N-1; iteracion++) {
			for(i=0; i<N-1-iteracion; i++) {
				if(X[i]>X[i+1]) {
					aux=X[i];
					X[i]=X[i+1];
					X[i+1]=aux;
				}
			}
		}
		/*//Imprimir
		System.out.println(" Ordenado ");
		for(i=0; i<N; i++) {
			System.out.print(X[i]+" ");
		}
		System.out.println("");
		//*/
		return X;
	}
	static double median(int N, int[] X) {
		//Median
		 double median=0;
		 int medianN;
		 if(N%2==0){
			 median=(X[N/2-1]+X[N/2])/2;
			 medianN = N/2;
		 }
		 else {
			 median=X[N/2];
			 medianN = N/2+1;
		 }
		 return median;
	}
	static void interquartiles(int N, int[] X) {
		X = ordenamientoBurbuja(N, X);
		//Median
		 double median=median(N, X);
		 int medianN = 0;
		 int[] firstHalf = new int[N], secondHalf = new int[N];
		 int NfirstHalf = 0, NsecondHalf = 0;
		 if(N%2==0) {
			 medianN = N/2;
			 firstHalf = new int[N-medianN];
			 secondHalf = new int[N-medianN];
			 for(i=0; i<N; i++) {
				 if(i<medianN) {
					 firstHalf[NfirstHalf] = X[i];
					 NfirstHalf += 1;
				 }else {
					 secondHalf[NsecondHalf] = X[i];
					 NsecondHalf += 1;
				 }
			 }
		 }
		 else { 
			 medianN = N/2+1;
			 firstHalf = new int[N-medianN];
			 secondHalf = new int[N-medianN];
			 for(i=0; i<N; i++) {
				 for(i=0; i<N; i++) {
					 if(i<medianN-1) {
						 firstHalf[NfirstHalf] = X[i];
						 NfirstHalf += 1;
					 }else if(i>medianN-1){
						 secondHalf[NsecondHalf] = X[i];
						 NsecondHalf += 1;
					 }
				 }
			 }
		 }
		 //System.out.println("Median "+median + " " +medianN);
		 //System.out.println("fisrt half has "+ NfirstHalf);
		 //System.out.println("second half has "+ NsecondHalf);
		 double Q1 = median(NfirstHalf, firstHalf), 
				 Q3 = median(NsecondHalf, secondHalf), Q2 = median;
		 //System.out.println("Q1 "+ Q1);
		 //System.out.println("Q2 "+ Q2);
		 //System.out.println("Q3 "+ Q3);
		 //System.out.println(Q1 + "\n" + Q2 + "\n" + Q3);
		 double interQuartiles = round(Q3-Q1,1);
		 System.out.println(interQuartiles);
		 
	}
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	 Scanner scan = new Scanner(System.in);
	 int n = scan.nextInt();
	 int[][] table = new int[n][2];
	 int[] X;
	 //read X
	 for(i=0; i<n; i++)
		 table[i][0] = scan.nextInt();
	 //read F
	 for(i=0; i<n; i++)
		 table[i][1] = scan.nextInt();
	 //Make a data set
	 int N = 0, cont = 0;
	 for(i=0; i<n; i++)
		 N += table[i][1];
	 X = new int[N];
	 for(i=0; i<n; i++)
		 for(int j=0; j<table[i][1]; j++) {
			 X[cont] = table[i][0];
			 cont += 1;
		 }
	 interquartiles(N, X);
  }
}
