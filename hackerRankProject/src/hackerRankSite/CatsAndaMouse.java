package hackerRankSite;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*; 

public class CatsAndaMouse {


    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {
    	int i = -1;

		//System.out.println(x+ " "+y+ " "+z );
    	while(true) {
    		i += 1;
    		if((x+i==z ||x-i==z) && (y+i==z || y-i==z))
    			return "Mouse C";
    		else if(x+i==z || x-i==z)
    			return "Cat A";
    		else if(y+i==z || y-i==z)
    			return "Cat B";
    	}
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] xyz = scanner.nextLine().split(" ");

            int x = Integer.parseInt(xyz[0]);

            int y = Integer.parseInt(xyz[1]);

            int z = Integer.parseInt(xyz[2]);

            String result = catAndMouse(x, y, z);
            System.out.println(result);

            //bufferedWriter.write(result);
            //bufferedWriter.newLine();
        }

        //bufferedWriter.close();

        scanner.close();
    }
}

/*
2
1 2 3
1 3 2

*/
