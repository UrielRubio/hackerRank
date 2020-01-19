package hackerRankSite;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CountingValleys {


    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
    	int valleys = 0, level=0;
    	for(int i=0; i<s.length(); i++) {
    		if(s.charAt(i)=='D' && level==0) {
    			level -= 1;
    			valleys += 1;
    		}else if(s.charAt(i)== 'U')
    			level += 1;
    		else if(s.charAt(i)== 'D')
    			level -= 1;
    	}
    		
    	return valleys;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        System.out.println(result);

        /*bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();*/

        scanner.close();
    }
}
/*
8
UDDDUDUU

18
UUDUDDDUDDDUDUUUDU
*/


