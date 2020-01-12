package DaysofCode30;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day10BinaryNumbers {




    private static final Scanner scanner = new Scanner(System.in);
    static int i;
    static String decimal2Binary(int n) {
    	String res = "";
    	while(n>0) {
    		res = (n % 2) + res;
    		n = n / 2;
    	}
    	//System.out.println("Bin "+res);
    	return res;
    }

    static int numberOfConsecutive1(String n) {
    	int res = -2, cont = 0;
    	char value;
    	for(i=n.length()-1; i>-1; i--) {
    		value = n.charAt(i);
    		if(cont>res)
    			res = cont;
    		if(value == '1')
    			cont += 1;
    		else 
    			cont = 0;
    		
    	}
    	return res;
    }
    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        System.out.print(numberOfConsecutive1(decimal2Binary(n)));
    }
}
