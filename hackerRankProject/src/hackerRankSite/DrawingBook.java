package hackerRankSite;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class DrawingBook {

    /*
     * Complete the pageCount function below.
     */
    static int pageCount(int n, int p) {
        int resFordward = 0, resBackforward = 0, i, res=0;
        for(i=0; i<=n/2; i++)
        	if(i*2 == p || i*2+1 == p) {
        		resFordward = i;
        		break;
        	}
        for(i=n/2; i>=0; i--)
        	if(i*2 == p || i*2+1 == p) {
        		resBackforward = n/2-i;
        		break;
        	}
        if(resFordward < resBackforward)
        	return resFordward;
        return resBackforward;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int p = scanner.nextInt();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int result = pageCount(n, p);
        System.out.println(result);
        /*
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
         */
        scanner.close();
    }
}
/*

6
2

5
4

*/
