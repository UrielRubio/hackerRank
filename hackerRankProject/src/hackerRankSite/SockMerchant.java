package hackerRankSite;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SockMerchant {


    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
    	int pairs = 0;
    	//Make a dictionary
    	Map<Integer, Integer> dictionary = new HashMap<Integer, Integer>();
    	for(int i = 0; i < ar.length; i++)
    		if(!dictionary.containsKey(ar[i])) 
    			dictionary.put(ar[i], 1);
    		else
    			dictionary.replace(ar[i], dictionary.get(ar[i])+1);
    	//make pairs
    	for(int key: dictionary.keySet())
    		pairs += dictionary.get(key)/2;
    	return pairs;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);
        
        System.out.println(result);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
    
}

/*
9
10 20 20 10 10 30 50 10 20

*/
