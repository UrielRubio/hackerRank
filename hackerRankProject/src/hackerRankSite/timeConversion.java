package hackerRankSite;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
public class timeConversion {


    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
    	String res="";
    	int h =Integer.parseInt(s.substring(0, 2));
    	//System.out.println(s.substring(8, 9).compareToIgnoreCase("P")+ " "+h);
    	if(s.substring(8, 9).compareToIgnoreCase("P")==0 && h<12)
    		res=(h+12)+s.substring(2, 8);
    	else if(h==12 && s.substring(8, 9).compareToIgnoreCase("A")==0)
    		res="00"+s.substring(2, 8);
    	else
    		res=s.substring(0, 8);
        return res;

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);
        System.out.println(result);
        /*bw.write(result);
        bw.newLine();

        bw.close();*/
    }
}
