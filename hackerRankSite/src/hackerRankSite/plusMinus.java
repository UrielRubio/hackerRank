package hackerRankSite;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class plusMinus {


    // Complete the plusMinus function below.
    static void plusMinus(int[] arr, int n) {
    	int pos=0, neg=0, zer=0;
    	for (int i=0; i<n; i++) {
    		if( arr[i]>0)
    			pos += 1;
    		else if( arr[i]<0)
    			neg += 1;
    		else
    			zer += 1;
    	}
    	double num =n, rPos= pos/num, rNeg= neg/num, rZer= zer/num;
		System.out.printf("%.6f %n", rPos);
		System.out.printf("%.6f %n", rNeg);
		System.out.printf("%.6f %n", rZer);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        //String[] arrItems = scanner.nextLine().split(" ");
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            //int arrItem = Integer.parseInt(arrItems[i]);
            //arr[i] = arrItem;
        	arr[i]= scanner.nextInt();
        }

        plusMinus(arr, n);

        scanner.close();
    }
}
