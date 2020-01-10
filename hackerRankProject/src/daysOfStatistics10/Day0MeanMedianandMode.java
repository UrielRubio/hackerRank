package daysOfStatistics10;
import java.io.*;
import java.util.*;
public class Day0MeanMedianandMode {
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
		for(i=0; i<N; i++) {
			System.out.print(X[i]+" ");
		}//*/
		return X;
	}
	 static void MeanMedianandMode(int N, int[] X) {
		 //Mean
		 double mean=0.0;
		 for(int i=0; i<N; i++) {
			 mean += X[i];
		 }
		 System.out.println(mean/N);
		 //Ordenar
		 X = ordenamientoBurbuja(N, X);
		 //Median
		 double median=0.0;
		 if(N%2==0) 
			 median=(X[N/2-1]+X[N/2])*0.5;
		 else
			 median=X[N/2];
		 System.out.println(median);
		 //Mode
		 int maxOcurrency=0, modeValue=0, ocurrency, aux;
		 for (int i=0; i<N; i++) {
			 ocurrency =1;
			 for(int j=0; j<N; j++) {
				 if(i!=j && X[i]==X[j])
					 ocurrency+=1;
			 }
			 if(ocurrency>maxOcurrency){
				 maxOcurrency=ocurrency;
				 modeValue=X[i];
			 }
		 }
		 System.out.println(modeValue);
		 
	 }
	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		 Scanner scan = new Scanner(System.in);
		 int N = scan.nextInt();
		 int[] X = new int[N];
		 for(int i=0; i<N; i++) {
			 X[i] = scan.nextInt();
		 }
		 MeanMedianandMode(N, X);
	  }
}
/*
10
64630 11735 14216 99233 14470 4978 73429 38120 51135 67060
*/