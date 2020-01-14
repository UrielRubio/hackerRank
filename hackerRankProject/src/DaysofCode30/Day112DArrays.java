package DaysofCode30;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day112DArrays {




    private static final Scanner scanner = new Scanner(System.in);
    private static void hourGlass(int[][] arr) {
    	int max = -100, sum = 0;
    	int[][] hourglass = {{1,1,1},{0,1,0},{1,1,1}};
    	for(int auxI=0; auxI<=3; auxI++) {
    		for(int auxJ=0; auxJ<=3; auxJ++) {
    			for(int i=0; i<3; i++) {
    				for(int j=0; j<3; j++) {
        	    		sum += arr[i+auxI][j+auxJ] *hourglass[i][j];
        	    	}
    	    	}
    			if(sum>max)
    				max = sum;
    			sum = 0;
        	}
    	}
    	System.out.println(max);
    }

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        scanner.close();
        hourGlass(arr);
    }
}
/*//
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0

*/