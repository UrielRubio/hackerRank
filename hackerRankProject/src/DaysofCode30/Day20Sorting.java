package DaysofCode30;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Day20Sorting {

    static void bubbleSortAlgorithm(int[] a) {
    	int aux = 0, numberOfSwaps = 0;;
    	for(int i=0; i<a.length; i++) {
    		
    		for(int j=0; j<a.length - 1; j++) {
    			if(a[j] > a[j+1]) {
    				aux = a[j]; 
    				a[j] = a[j+1];
    				a[j+1] = aux;
    				
    				numberOfSwaps ++;
    			}
    		}
    		if(numberOfSwaps == 0)
    			break;
    	}
    	System.out.println("Array is sorted in " + numberOfSwaps + " swaps");
    	System.out.println(a[0]);
    	System.out.println(a[a.length-1]);
    }
    
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        // Write Your Code Here
        bubbleSortAlgorithm(a);
    }
}

/*
3
1 2 3

3
3 2 1

*/
